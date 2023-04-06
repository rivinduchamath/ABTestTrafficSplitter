package com.cloudofgoods.xenia.rootcampaign;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AbTestDTO {

    private String variant;
    private String slot;
    private double persentage;

}
