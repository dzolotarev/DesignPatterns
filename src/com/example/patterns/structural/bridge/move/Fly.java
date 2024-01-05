package com.example.patterns.structural.bridge.move;

/**
 * Created by Denis Zolotarev on 02.11.2023.
 */
public class Fly implements MoveLogic {
    private static final String FLY = " машет крыльями.";

    @Override
    public void move(String name) {
        System.out.println(name + FLY);
    }
}
