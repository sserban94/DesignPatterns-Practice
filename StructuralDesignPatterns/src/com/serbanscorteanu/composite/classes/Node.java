package com.serbanscorteanu.composite.classes;

public class Node extends AbstractNode{
    // leaf class
    private String name;
    private float price;

    public Node(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getPrice() {
        return this.price;
    }
}
