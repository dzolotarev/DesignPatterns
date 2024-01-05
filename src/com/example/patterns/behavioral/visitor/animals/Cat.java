package com.example.patterns.behavioral.visitor.animals;

import com.example.patterns.behavioral.visitor.visitor.Visitor;

public class Cat extends Animal {

    private int mice;
    private double kilogramsOfFur;

    @Override
    public String getName() {
        return "Кот";
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCat(this);
    }

    public int miceCaught() {
        return mice;
    }

    public double furEaten() {
        return kilogramsOfFur;
    }

    public void hunt() {
        mice++;
        System.out.println(getName() + " поймал мышь.");
    }

    public void licks() {
        kilogramsOfFur += 0.005;
        System.out.println(getName() + " лижет шерсть.");
    }
}
