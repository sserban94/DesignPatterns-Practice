package com.serbanscorteanu.factory.factorymethod.classes;

public abstract class AbstractDoc {
    protected String name;

    public abstract String getType();
    public abstract void print(String text);

    public void setName(String name){
        this.name = name;
    }
}
