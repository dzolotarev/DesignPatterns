package com.example.patterns.generating.abstractfactory.middles;

public class PythonMiddle implements MiddleDeveloper {
    @Override
    public void writeNewModule() {
        System.out.println("Пишет новый модуль для системы машинного обучения.");
    }
}
