package com.example.patterns.behavioral.templatemethod.games;

public class WelcomeTo extends BoardGame {
    @Override
    protected void initialize() {
        System.out.println("""
                -----------------------------------------------------
                Подготовка к игре Бумажные кварталы:
                    - раздаем игрокам игровые поля и шариковые ручки;
                    - случайным образом выбираем три плана застройки;
                    - подготавливаем три стопки карт строительства.""");
    }

    @Override
    protected void play() {
        System.out.println("Игроки строят жилые кварталы с парками и бассейнами, нанимают торговых агентов и гастарбайтеров.");
    }

    @Override
    protected void end() {
        System.out.println("Один из игроков выполнил все три плана застройки.");
    }
}
