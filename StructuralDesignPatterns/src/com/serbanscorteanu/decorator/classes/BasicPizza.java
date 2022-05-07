package com.serbanscorteanu.decorator.classes;

public class BasicPizza extends APizza{
    @Override
    public void getIngredients() {
        System.out.println("basic pizza ingredients");
    }

    @Override
    public void calculateCost() {
        System.out.println(super.price);
    }
}
