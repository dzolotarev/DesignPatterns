package com.example.patterns.generating.builder;

import com.example.patterns.generating.builder.builders.PizzaBuilder;
import com.example.patterns.generating.builder.builders.PizzaRecipeBuilder;
import com.example.patterns.generating.builder.director.Director;
import com.example.patterns.generating.builder.pizzas.Pizza;
import com.example.patterns.generating.builder.pizzas.Recipe;

/* 
Все ходы записаны
*/

public class Solution {

    public static void main(String[] args) {
        Director director = new Director();

        PizzaBuilder builder = new PizzaBuilder();
        director.makeHawaiianPizza(builder);
        Pizza pizza = builder.getResult();
        System.out.println("Pizza made:\n" + pizza.getType());

        PizzaRecipeBuilder recipeBuilder = new PizzaRecipeBuilder();
        director.makeSpicyPizza(recipeBuilder);
        Recipe pizzaRecipe = recipeBuilder.getResult();
        System.out.println("\nPizza recipe made:\n" + pizzaRecipe.print());
    }
}
