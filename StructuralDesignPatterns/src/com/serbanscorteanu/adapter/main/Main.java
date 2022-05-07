package com.serbanscorteanu.adapter.main;

import com.serbanscorteanu.adapter.adapters.Laser2InkClassAdapter;
import com.serbanscorteanu.adapter.classes.InkPrinter;
import com.serbanscorteanu.adapter.classes.InkPrinterAbstractClass;
import com.serbanscorteanu.adapter.classes.InkPrinterInterface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<InkPrinterAbstractClass> inkPrinters = new ArrayList<>();

        InkPrinterAbstractClass hrPrinter = new InkPrinter();
        InkPrinterAbstractClass devPrinter = new InkPrinter();

        inkPrinters.add(hrPrinter);
        inkPrinters.add(devPrinter);

        Laser2InkClassAdapter laserPrinter = new Laser2InkClassAdapter();
        inkPrinters.add(laserPrinter);

        inkPrinters.stream().forEach(printer -> printer.print("hello!\n"));
    }
}
