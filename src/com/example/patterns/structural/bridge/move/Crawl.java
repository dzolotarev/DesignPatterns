package com.example.patterns.structural.bridge.move;

/**
 * Created by Denis Zolotarev on 02.11.2023.
 */
public class Crawl implements MoveLogic {
    private static final String CRAWL = " ползет извиваясь.";

    @Override
    public void move(String name) {
        System.out.println(name + CRAWL);
    }
}
