package com.example.patterns.structural.decorator;

/**
 * Created by Denis Zolotarev on 31.10.2023.
 */
public class WithChicken extends PizzaDecorator {
    public WithChicken(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 20;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", курица";
    }
}
