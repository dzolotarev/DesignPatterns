package com.example.patterns.structural.decorator;

/* 
Фирменный рецепт
*/

public class Solution {

    public static void main(String[] args) {
        Pizza pizza = new SimplePizza();
        printInfo(pizza);

        pizza = new WithChicken(pizza);
        printInfo(pizza);

        pizza = new WithSausage(pizza);
        printInfo(pizza);

        pizza = new WithArugula(pizza);
        printInfo(pizza);
    }

    public static void printInfo(Pizza c) {
        System.out.println("Итого: " + c.getCost() + "; Состав: " + c.getIngredients());
    }
}
