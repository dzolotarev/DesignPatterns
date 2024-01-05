package com.example.patterns.structural.bridge.creature;

import com.example.patterns.structural.bridge.move.MoveLogic;
import com.example.patterns.structural.bridge.sound.SoundLogic;

/**
 * Created by Denis Zolotarev on 02.11.2023.
 */
public abstract class Creature {
    protected MoveLogic moveLogic;
    protected SoundLogic soundLogic;

    public Creature(MoveLogic moveLogic, SoundLogic soundLogic) {
        this.moveLogic = moveLogic;
        this.soundLogic = soundLogic;
    }

    public abstract String getName();

    public void howDoIMove() {
        moveLogic.move(getName());
    }

    public void howDoISound() {
        soundLogic.sound(getName());
    }


}
