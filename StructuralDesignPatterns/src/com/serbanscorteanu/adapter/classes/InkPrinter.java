package com.serbanscorteanu.adapter.classes;

public class InkPrinter extends InkPrinterAbstractClass{
    @Override
    public void print(String text) {
        System.out.println("Printing.. " + text);
    }

    @Override
    public void cancel() {
        System.out.println("Canceling print");
    }
}
