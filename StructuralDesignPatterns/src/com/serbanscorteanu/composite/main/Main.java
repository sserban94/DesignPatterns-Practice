package com.serbanscorteanu.composite.main;

import com.serbanscorteanu.composite.classes.Node;
import com.serbanscorteanu.composite.classes.Structure;

public class Main {
    public static void main(String[] args) throws Exception {
        Structure menu = new Structure("Menu");

        Structure menuDrinks = new Structure("Drinks");
        Structure menuFood = new Structure("Food");

        menu.addNode(menuFood);
        menu.addNode(menuDrinks);

        Structure alcoholMenu = new Structure("Alcohol Menu");
        Structure nonAlcoholMenu = new Structure("Non Alcohol Menu");

        menuDrinks.addNode(alcoholMenu);
        menuDrinks.addNode(nonAlcoholMenu);

        Node pizzaCarbonara = new Node("Pizza Carbonara", 25);
        menuFood.addNode(pizzaCarbonara);
        Node pastraCarbonara = new Node("Pasta Carbonara", 30);
        menuFood.addNode(pastraCarbonara);
        System.out.println(menu.getInfo());
    }
}
