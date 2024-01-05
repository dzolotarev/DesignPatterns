package com.example.patterns.structural.decorator;

/**
 * Created by Denis Zolotarev on 31.10.2023.
 */
public class WithSausage extends PizzaDecorator {
    public WithSausage(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 25;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", колбаса";
    }
}
