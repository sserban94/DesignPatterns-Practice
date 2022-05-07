package com.serbanscorteanu.factory.simplefactory.main;

import com.serbanscorteanu.factory.simplefactory.classes.AbstractWeapon;
import com.serbanscorteanu.factory.simplefactory.classes.WeaponTypeEnum;
import com.serbanscorteanu.factory.simplefactory.classes.concreteclasses.MachineGun;
import com.serbanscorteanu.factory.simplefactory.classes.concreteclasses.WeaponFactory;

public class Main {
    public static void main(String[] args) {
        AbstractWeapon machineGun = WeaponFactory.getWeapon(WeaponTypeEnum.MACHINE_GUN, "SMG");
        AbstractWeapon pistol = WeaponFactory.getWeapon(WeaponTypeEnum.PISTOL, "Glock");

        if(machineGun instanceof MachineGun){
            MachineGun mg = (MachineGun) machineGun;
            mg.setFireRate(100);
        }
    }
}
