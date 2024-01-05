package com.example.patterns.structural.bridge.creature;

import com.example.patterns.structural.bridge.move.MoveLogic;
import com.example.patterns.structural.bridge.sound.SoundLogic;

/**
 * Created by Denis Zolotarev on 02.11.2023.
 */
public class Cat extends Creature {
    private static final String NAME = "Кошка";
    private static final String CATCH = " ловит мышей.";

    public Cat(MoveLogic moveLogic, SoundLogic soundLogic) {
        super(moveLogic, soundLogic);
    }

    @Override
    public String getName() {
        return NAME;
    }

    public void catchMice() {
        System.out.println(getName() + CATCH);
    }
}
