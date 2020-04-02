package com.jason.designpattern;

import com.jason.designpattern.structual.decorator.Bacon;
import com.jason.designpattern.structual.decorator.Cheese;
import com.jason.designpattern.structual.decorator.Pizza;
import com.jason.designpattern.structual.decorator.ThickCrustPizza;
import org.junit.Test;

public class DecoratorTest {
    @Test
    public void test_decorator() {
        Pizza thickCrustPizza = new ThickCrustPizza();
        System.out.println(thickCrustPizza.getDescription());
        System.out.println(thickCrustPizza.getCost());

        Pizza cheeseThickCrustPizza = new Cheese(thickCrustPizza);
        System.out.println(cheeseThickCrustPizza.getDescription());
        System.out.println(cheeseThickCrustPizza.getCost());

        Pizza doubleCheeseThickCrustPizza = new Cheese(cheeseThickCrustPizza);
        System.out.println(doubleCheeseThickCrustPizza.getDescription());
        System.out.println(doubleCheeseThickCrustPizza.getCost());

        Pizza doubleCheeseBaconThickCrustPizza = new Bacon(doubleCheeseThickCrustPizza);
        System.out.println(doubleCheeseBaconThickCrustPizza.getDescription());
        System.out.println(doubleCheeseBaconThickCrustPizza.getCost());
    }
}
