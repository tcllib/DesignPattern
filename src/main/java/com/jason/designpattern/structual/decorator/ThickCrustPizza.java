package com.jason.designpattern.structual.decorator;

import java.math.BigDecimal;

public class ThickCrustPizza extends Pizza {
    public ThickCrustPizza() {
        super();
        description = "thick crust pizza";
    }

    public BigDecimal getCost() {
        return new BigDecimal(15.00);
    }
}
