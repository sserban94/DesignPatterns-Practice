package com.serbanscorteanu.adapter.classes;

import java.util.Arrays;

public class LaserPrinter implements LaserPrinterInterface{
    @Override
    public void laserPrint(String[] pages) {
        System.out.println("Laser printing pages:");
        System.out.println();
        Arrays.stream(pages).forEach(System.out::println);
    }

    @Override
    public void cancelPrint() {
        System.out.println("Canceling laser print");
    }
}
