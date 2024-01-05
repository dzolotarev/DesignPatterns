package com.example.patterns.structural.decorator;

/**
 * Created by Denis Zolotarev on 31.10.2023.
 */
public abstract class PizzaDecorator implements Pizza {
    private final Pizza decoratedPizza;

    public PizzaDecorator(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost();
    }

    @Override
    public String getIngredients() {
        return decoratedPizza.getIngredients();
    }
}
