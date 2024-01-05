package com.example.patterns.structural.bridge.creature;

import com.example.patterns.structural.bridge.move.MoveLogic;
import com.example.patterns.structural.bridge.sound.SoundLogic;

/**
 * Created by Denis Zolotarev on 03.11.2023.
 */
public class Human extends Creature {
    private static final String HUMAN = "Человек";
    private static final String SEARCH_MEANING_OF_LIFE = " ищет смысл жизни.";

    public Human(MoveLogic moveLogic, SoundLogic soundLogic) {
        super(moveLogic, soundLogic);
    }

    @Override
    public String getName() {
        return HUMAN;
    }

    public void searchMeaningOfLife() {
        System.out.println(getName() + SEARCH_MEANING_OF_LIFE);
    }
}
