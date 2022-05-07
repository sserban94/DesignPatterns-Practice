package com.serbanscorteanu.decorator.classes;

public abstract class APizza {
    private String name;
    protected double price;

    public abstract void getIngredients();
    public abstract void calculateCost();
}
