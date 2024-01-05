package com.example.patterns.structural.bridge.sound;

/**
 * Created by Denis Zolotarev on 02.11.2023.
 */
public class Meow implements SoundLogic {
    private static final String MEOW = " мяукает.";

    @Override
    public void sound(String name) {
        System.out.println(name + MEOW);
    }
}
