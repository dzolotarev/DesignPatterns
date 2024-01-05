package com.example.patterns.generating.abstractfactory.middles;

public class JavaScriptMiddle implements MiddleDeveloper {
    @Override
    public void writeNewModule() {
        System.out.println("Пишет новое расширение для браузера.");
    }
}
