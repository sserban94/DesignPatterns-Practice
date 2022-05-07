package com.serbanscorteanu.factory.simplefactory.classes.concreteclasses;

import com.serbanscorteanu.factory.simplefactory.classes.AbstractWeapon;

public class Bazooka extends AbstractWeapon {
    public static final int DEFAULT_DISTANCE = 50;
    int distance;

    protected Bazooka(String model, int distance) {
        super(model);
        this.distance = distance;
    }

    @Override
    public void reload() {

    }

    @Override
    public void shoot() {

    }
}
