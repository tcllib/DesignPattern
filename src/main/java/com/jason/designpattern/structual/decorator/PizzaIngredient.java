package com.jason.designpattern.structual.decorator;

import java.math.BigDecimal;

public abstract class PizzaIngredient extends Pizza {

    public BigDecimal getCost() {
        return null;
    }

    public abstract String getDescription();
}
