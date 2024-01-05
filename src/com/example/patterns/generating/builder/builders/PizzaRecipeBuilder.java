package com.example.patterns.generating.builder.builders;

import com.example.patterns.generating.builder.pizzas.PizzaType;
import com.example.patterns.generating.builder.pizzas.Recipe;

/**
 * Created by Denis Zolotarev on 04.11.2023.
 */
public class PizzaRecipeBuilder implements Builder {
    private PizzaType type;
    private String dough;
    private String sauce;
    private String topping;

    @Override
    public void setType(PizzaType type) {
        this.type = type;
    }

    @Override
    public void setDough(String dough) {
        this.dough = dough;
    }

    @Override
    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    @Override
    public void setTopping(String topping) {
        this.topping = topping;
    }

    public Recipe getResult() {
        return new Recipe(type, dough, sauce, topping);
    }

}
