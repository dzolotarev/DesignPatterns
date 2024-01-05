package com.example.patterns.structural.bridge.move;

/**
 * Created by Denis Zolotarev on 02.11.2023.
 */
public class Swim implements MoveLogic {
    private static final String SWIM = " гребет ластами.";

    @Override
    public void move(String name) {
        System.out.println(name + SWIM);
    }
}
