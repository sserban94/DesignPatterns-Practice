package com.serbanscorteanu.factory.simplefactory.classes.concreteclasses;

import com.serbanscorteanu.factory.simplefactory.classes.AbstractWeapon;

public class MachineGun extends AbstractWeapon {
    float fireRate;

    protected MachineGun(String model, float fireRate) {
        super(model);
        this.fireRate = fireRate;
    }

    @Override
    public void reload() {

    }

    @Override
    public void shoot() {

    }

    public void setFireRate(float newRate){
        this.fireRate = newRate;
    }
}
