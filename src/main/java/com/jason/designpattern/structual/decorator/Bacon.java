package com.jason.designpattern.structual.decorator;

import java.math.BigDecimal;

public class Bacon extends PizzaIngredient {
    private Pizza pizza;

    public Bacon(Pizza pizza) {
        this.pizza = pizza;
    }


    public String getDescription() {
        return pizza.getDescription() + " and bacon";
    }

    @Override
    public BigDecimal getCost() {
        return (new BigDecimal(3.00)).add(pizza.getCost());
    }
}
