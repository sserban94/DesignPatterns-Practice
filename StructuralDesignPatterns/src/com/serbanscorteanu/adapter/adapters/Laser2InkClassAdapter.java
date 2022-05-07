package com.serbanscorteanu.adapter.adapters;

import com.serbanscorteanu.adapter.classes.InkPrinter;
import com.serbanscorteanu.adapter.classes.InkPrinterAbstractClass;
import com.serbanscorteanu.adapter.classes.LaserPrinterInterface;

import java.util.Arrays;

public class Laser2InkClassAdapter extends InkPrinterAbstractClass implements LaserPrinterInterface {

    @Override
    public void laserPrint(String[] pages) {
        StringBuilder builder = new StringBuilder();
        builder.append("Laser printing..\n");
        Arrays.stream(pages).forEach(builder::append);
        super.print(builder.toString());
    }

    @Override
    public void cancelPrint() {
        super.cancel();
    }
}
