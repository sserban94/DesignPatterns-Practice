package com.serbanscorteanu.adapter.classes;

public class InkPrinterAbstractClass {
    public void print(String text) {
        System.out.println("Printing.. " + text);
    }
    public void cancel() {
        System.out.println("Canceling print");
    }
}
