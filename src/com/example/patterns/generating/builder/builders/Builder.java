package com.example.patterns.generating.builder.builders;

import com.example.patterns.generating.builder.pizzas.PizzaType;

/**
 * Created by Denis Zolotarev on 04.11.2023.
 */
public interface Builder {
    void setType(PizzaType type);

    void setDough(String dough);

    void setSauce(String sauce);

    void setTopping(String topping);
}
