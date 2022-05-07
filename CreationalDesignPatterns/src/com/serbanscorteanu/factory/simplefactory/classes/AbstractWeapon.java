package com.serbanscorteanu.factory.simplefactory.classes;

public abstract class AbstractWeapon {
    String model;

    protected AbstractWeapon(String model) {
        this.model = model;
    }

    public abstract void reload();
    public abstract void shoot();
}
