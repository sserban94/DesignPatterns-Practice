package com.serbanscorteanu.decorator.main;

import com.serbanscorteanu.decorator.classes.APizza;
import com.serbanscorteanu.decorator.classes.BasicPizza;
import com.serbanscorteanu.decorator.classes.DecoratorChickenPizza;

public class Main {
    public static void main(String[] args) {
        APizza basicPizza = new BasicPizza();
        System.out.println("Basic pizza");
        basicPizza.getIngredients();
        basicPizza.calculateCost();

        System.out.println("------------------------------------------");

        APizza chickenPizza = new DecoratorChickenPizza(basicPizza);
        System.out.println("Chicken Pizza");
        chickenPizza.getIngredients();
        chickenPizza.calculateCost();
    }
}
