package com.example.patterns.behavioral.templatemethod;

import com.example.patterns.behavioral.templatemethod.games.Catan;
import com.example.patterns.behavioral.templatemethod.games.DiceForge;
import com.example.patterns.behavioral.templatemethod.games.WelcomeTo;

/* 
Игра как жизнь
*/

public class Solution {

    public static void main(String[] args) {
        new Catan().start(4);
        new DiceForge().start(2);
        new WelcomeTo().start(10);
    }
}
