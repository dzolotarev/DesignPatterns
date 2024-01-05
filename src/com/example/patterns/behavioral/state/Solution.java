package com.example.patterns.behavioral.state;

import com.example.patterns.behavioral.state.ui.Player;
import com.example.patterns.behavioral.state.ui.UI;

/* 
Usb mp3 плеер
*/

public class Solution {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
