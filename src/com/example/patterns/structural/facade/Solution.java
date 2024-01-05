package com.example.patterns.structural.facade;

import com.example.patterns.structural.facade.facade.PotionConversionFacade;

/* 
Алхимическая библиотека
*/

public class Solution {

    public static String potionName = "Minor Healing Potion";
    public static String type = "stamina";

    public static void main(String[] args) {
        PotionConversionFacade potionConversionFacade = new PotionConversionFacade();
        System.out.println(potionConversionFacade.convertPotion(potionName, type));
    }
}
