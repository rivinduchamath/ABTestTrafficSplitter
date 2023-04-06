package com.cloudofgoods.xenia.rootcampaign.service.impl;

import com.cloudofgoods.xenia.rootcampaign.AbTestDTO;
import com.cloudofgoods.xenia.rootcampaign.service.ResponService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class RatioDistribution implements ResponService {

    public String getValues() {
        List<RatioGroup> ratioGroups = calcValues();
        for (int i = 1; i < 101; i++) {
            userData(ratioGroups);
        }
        return "";
    }

    public List<RatioGroup> calcValues() {
        List<AbTestDTO> abTestDTOList = new ArrayList<>();
        abTestDTOList.add(new AbTestDTO( "varOne","slotOne", 60));
        abTestDTOList.add(new AbTestDTO( "varTwo","sloTwo", 40));
        double maxPercentage = abTestDTOList.stream().mapToDouble(AbTestDTO::getPersentage).filter(abTestDTO -> abTestDTO >= 0.0).max().orElse(0.0);
        List<Double> normalizedRatioList = new ArrayList<>();
        for (AbTestDTO abTestDTO : abTestDTOList) {
            double normalizedRatio = abTestDTO.getPersentage() / maxPercentage;
            normalizedRatioList.add(normalizedRatio);
        }
        normalizedRatioList.sort(Collections.reverseOrder());

        List<RatioGroup> ratioGroupList = new ArrayList<>();
        for (int i = 0; i < normalizedRatioList.size(); i++) {
            double ratio = normalizedRatioList.get(i);
            RatioGroup ratioGroup = new RatioGroup(i + 1, ratio);
            ratioGroupList.add(ratioGroup);
        }
        return ratioGroupList;
    }

    void userData(List<RatioGroup> ratioGroupList) {

        RatioGroup selectedGroup = null;
        for (RatioGroup ratioGroup : ratioGroupList) {
            if (ratioGroup.remainingBalance >= 1) {
                selectedGroup = ratioGroup;
                break;
            }
        }
        if (selectedGroup == null) {
            // All groups have 0 remaining balance, refresh the ratios
            for (RatioGroup ratioGroup : ratioGroupList) {
                ratioGroup.remainingBalance = ratioGroup.ratio;
            }
            selectedGroup = ratioGroupList.get(0);
        }
        int targetGroupIndex = selectedGroup.groupIndex - 1;
        ratioGroupList.get(targetGroupIndex).userCount++;
        ratioGroupList.get(targetGroupIndex).remainingBalance--;
        for (RatioGroup ratioGroup : ratioGroupList) {
            if (ratioGroup.remainingBalance < 1) {
                ratioGroup.remainCollectedBalance += ratioGroup.remainingBalance;
                ratioGroup.remainingBalance = 0;
                if (ratioGroup.remainCollectedBalance >= 1) {
                    ratioGroup.remainingBalance += 1;
                    ratioGroup.remainCollectedBalance -= 1;
                }
            }
        }
        System.out.println("USER : " + "user" + "\tGROUP : " + (targetGroupIndex + 1) + "\tUSER_COUNT : " + ratioGroupList.get(targetGroupIndex).userCount + "\tRATIO : " + ratioGroupList.get(targetGroupIndex).ratio + "\tU/C : " + ratioGroupList.get(targetGroupIndex).userCount + "\tR/B : " + ratioGroupList.get(targetGroupIndex).remainingBalance + "\tR/C/B : " + ratioGroupList.get(targetGroupIndex).remainCollectedBalance);
    }

    static class RatioGroup {
        int groupIndex;
        int userCount;
        double ratio;
        double remainingBalance;
        double remainCollectedBalance;

        public RatioGroup(int groupIndex, double ratio) {
            this.groupIndex = groupIndex;
            this.ratio = ratio;
            this.remainingBalance = ratio;
        }
    }
}