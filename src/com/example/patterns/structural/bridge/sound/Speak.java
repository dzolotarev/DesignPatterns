package com.example.patterns.structural.bridge.sound;

/**
 * Created by Denis Zolotarev on 02.11.2023.
 */
public class Speak implements SoundLogic {
    private static final String SPEAK = " говорит.";

    @Override
    public void sound(String name) {
        System.out.println(name + SPEAK);
    }
}
