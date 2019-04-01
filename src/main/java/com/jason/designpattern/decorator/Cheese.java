package com.jason.designpattern.decorator;

import java.math.BigDecimal;

public class Cheese extends PizzaIngredient {
    private Pizza pizza;

    public Cheese(Pizza pizza) {
        super();
        this.pizza = pizza;
    }
    public String getDescription() {
        return pizza.getDescription() + " and Cheese";
    }

    @Override
    public BigDecimal getCost() {
        return (new BigDecimal(1.5)).add(pizza.getCost());
    }
}
