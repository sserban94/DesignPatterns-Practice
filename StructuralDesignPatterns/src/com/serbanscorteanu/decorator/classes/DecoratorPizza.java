package com.serbanscorteanu.decorator.classes;

public class DecoratorPizza extends APizza{
    private APizza aPizza;

    public DecoratorPizza(APizza aPizza){
        this.aPizza = aPizza;
    }

    @Override
    public void getIngredients() {
        aPizza.getIngredients();
    }

    @Override
    public void calculateCost() {
        aPizza.calculateCost();
    }
}
