package com.example.patterns.structural.bridge;

/* 
Фантастические твари
*/

import com.example.patterns.structural.bridge.creature.Cow;
import com.example.patterns.structural.bridge.move.Fly;
import com.example.patterns.structural.bridge.sound.Meow;

public class Solution {

    public static void main(String[] args) {
        FlyingSpeakingСow cow = new FlyingSpeakingСow();
        cow.move();
        cow.sound();
        cow.giveMilk();

        SwimmingMeowingHuman human = new SwimmingMeowingHuman();
        human.move();
        human.sound();
        human.searchMeaningOfLife();


        Cow cow1 = new Cow(new Fly(), new Meow());
        cow1.howDoIMove();
        cow1.howDoISound();
        cow1.giveMilk();

    }
}
