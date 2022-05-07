package com.serbanscorteanu.factory.simplefactory.classes.concreteclasses;

import com.serbanscorteanu.factory.simplefactory.classes.AbstractWeapon;

public class Pistol extends AbstractWeapon {

    boolean hasCartridge;

    public Pistol(String model, boolean hasCartridge) {
        super(model);
        this.hasCartridge = hasCartridge;
    }

    @Override
    public void reload() {

    }

    @Override
    public void shoot() {

    }
}
