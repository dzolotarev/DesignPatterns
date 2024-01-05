package com.example.patterns.structural.bridge.creature;

import com.example.patterns.structural.bridge.move.MoveLogic;
import com.example.patterns.structural.bridge.sound.SoundLogic;

/**
 * Created by Denis Zolotarev on 02.11.2023.
 */
public class Cow extends Creature {
    private static final String NAME = "Корова";
    private static final String GIVE_MILK = " дает молоко.";

    public Cow(MoveLogic moveLogic, SoundLogic soundLogic) {
        super(moveLogic, soundLogic);
    }

    @Override
    public String getName() {
        return NAME;
    }

    public void giveMilk() {
        System.out.println(getName() + GIVE_MILK);
    }
}
