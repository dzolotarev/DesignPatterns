package com.example.patterns.structural.decorator;

/**
 * Created by Denis Zolotarev on 31.10.2023.
 */
public class WithArugula extends PizzaDecorator {
    public WithArugula(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 15;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", руккола";
    }
}
