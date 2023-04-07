package com.cloudofgoods.xenia.rootcampaign.service.impl;

import com.cloudofgoods.xenia.rootcampaign.service.ResponService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@Slf4j
public class RatioDistribution implements ResponService {


    public String getValues() {
        List<RatioGroup> abTestDTOList = new ArrayList<>();
        abTestDTOList.add(new RatioGroup( "varOne","slotOne", 50));
        abTestDTOList.add(new RatioGroup( "varTwo","sloTwo", 20));
        abTestDTOList.add(new RatioGroup( "varThree","sloThree", 20));
        abTestDTOList.add(new RatioGroup( "varFour","sloFour", 10));
        calcValues(abTestDTOList);

        return userData(abTestDTOList);

    }
    Map<String , RatioGroup> ratioGroupMap = new HashMap<>();

    public void calcValues(List<RatioGroup> abTestDTOList) {

        double maxPercentage = abTestDTOList.stream().mapToDouble(RatioGroup::getPercentage).filter(abTestDTO -> abTestDTO >= 0.0).max().orElse(0.0);
        List<RatioGroup> normalizedRatioList = new ArrayList<>();
        for (RatioGroup abTestDTO : abTestDTOList) {
            double normalizedRatio = abTestDTO.getPercentage() / maxPercentage;
            abTestDTO.setPercentage(normalizedRatio);
            normalizedRatioList.add(abTestDTO);
        }
        normalizedRatioList = normalizedRatioList.stream().sorted(Comparator.comparingDouble(RatioGroup::getPercentage).reversed()).collect(Collectors.toList());
        List<RatioGroup> ratioGroupList = new ArrayList<>();
        for (int i = 0; i < normalizedRatioList.size(); i++) {
            double ratio = normalizedRatioList.get(i).getPercentage();

            String key = normalizedRatioList.get(i).getSlot()+normalizedRatioList.get(i).getVariant();
            RatioGroup orDefault = ratioGroupMap.getOrDefault(key, null);
            if(orDefault == null) {
                RatioGroup ratioGroup = new RatioGroup(i + 1, ratio);
                ratioGroup.setSlot(normalizedRatioList.get(i).getSlot());
                ratioGroup.setVariant(normalizedRatioList.get(i).getVariant());
                ratioGroup.setPercentage(normalizedRatioList.get(i).getPercentage());
                ratioGroupList.add(ratioGroup);
                ratioGroupMap.put(key, ratioGroup);
            log.info("RATIO GROUP LIST Group Index :" + ratioGroup.groupIndex +"Remaining Balance "+ ratioGroup.remainingBalance);
        }
        }
    }

    String userData(List<RatioGroup> oldRation) {
        List<RatioGroup> ratioGroupList = new ArrayList<>();
        for (RatioGroup ratioGroup  :oldRation){
           ratioGroup =  ratioGroupMap.get(ratioGroup.getSlot()+ratioGroup.getVariant());
           ratioGroupList.add(ratioGroup);
        }
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
        RatioGroup ratioGroup = new RatioGroup();
        ratioGroup.setRatio(ratioGroupList.get(targetGroupIndex).ratio);
        ratioGroup.setGroupIndex(ratioGroupList.get(targetGroupIndex).groupIndex);
        ratioGroup.setPercentage(ratioGroupList.get(targetGroupIndex).percentage);
        ratioGroup.setUserCount(ratioGroupList.get(targetGroupIndex).userCount);
        ratioGroup.setRemainingBalance(ratioGroupList.get(targetGroupIndex).remainingBalance);
        ratioGroup.setRemainCollectedBalance(ratioGroupList.get(targetGroupIndex).remainCollectedBalance);
        ratioGroup.setVariant(ratioGroupList.get(targetGroupIndex).variant);
        ratioGroup.setSlot(ratioGroupList.get(targetGroupIndex).slot);
        ratioGroupMap.put(ratioGroupList.get(targetGroupIndex).getSlot() + ratioGroupList.get(targetGroupIndex).getVariant(),ratioGroup);

        return ("USER : " + "user" +
                "\tGROUP : " + (targetGroupIndex + 1) +
                "\tUSER_COUNT : " + ratioGroupList.get(targetGroupIndex).userCount +
                "\tRATIO : " + ratioGroupList.get(targetGroupIndex).ratio +
                "\tU/C : " + ratioGroupList.get(targetGroupIndex).userCount +
                "\tR/B : " + ratioGroupList.get(targetGroupIndex).remainingBalance +
                "\tVariant : " + ratioGroupList.get(targetGroupIndex).variant +
                "\tSlot : " + ratioGroupList.get(targetGroupIndex).variant +
                "\tR/C/B : " + ratioGroupList.get(targetGroupIndex).remainCollectedBalance);
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class RatioGroup {
        String variant;
        String slot;
        double percentage;
        int groupIndex;
        int userCount;
        double ratio;
        double remainingBalance;
        double remainCollectedBalance;

        public RatioGroup(String variant, String slot, double percentage) {
            this.variant = variant;
            this.slot = slot;
            this.percentage = percentage;
        }

        public RatioGroup(int groupIndex, double ratio) {
            this.groupIndex = groupIndex;
            this.ratio = ratio;
            this.remainingBalance = ratio;
        }
    }
}