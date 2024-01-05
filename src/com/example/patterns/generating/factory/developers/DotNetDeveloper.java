package com.example.patterns.generating.factory.developers;

public class DotNetDeveloper implements Developer {
    @Override
    public void study() {
        writeCode();
    }

    @Override
    public void writeCode() {
        System.out.println("Шлепает формы...");
    }
}
