package com.serbanscorteanu.factory.simplefactory.classes.concreteclasses;

import com.serbanscorteanu.factory.simplefactory.classes.AbstractWeapon;
import com.serbanscorteanu.factory.simplefactory.classes.WeaponTypeEnum;

public class WeaponFactory {
    public static AbstractWeapon getWeapon(WeaponTypeEnum type, String model){
        boolean hasCartridge = true;

        switch (type){
            case PISTOL:
                return new Pistol(model, hasCartridge);
            case BAZOOKA:
                return new Bazooka(model, Bazooka.DEFAULT_DISTANCE);
            case MACHINE_GUN:
                return new MachineGun(model, 1000);
            default:
                throw new UnsupportedOperationException();
        }
    }
}
