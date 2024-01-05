package com.example.patterns.behavioral.visitor.animals;

import com.example.patterns.behavioral.visitor.visitor.Visitor;

public class Cow extends Animal {

    private int litersOfMilk;
    private int stars;

    @Override
    public String getName() {
        return "Корова";
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCow(this);
    }

    public int milkedLiters() {
        return litersOfMilk;
    }

    public int getStars() {
        return stars;
    }

    public void giveMilk() {
        litersOfMilk += 20;
        System.out.println(getName() + " дала молока.");
    }

    public void gore() {
        stars++;
        System.out.println(getName() + " забодала зеваку.");
    }
}
