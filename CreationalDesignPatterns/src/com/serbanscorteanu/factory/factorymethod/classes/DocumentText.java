package com.serbanscorteanu.factory.factorymethod.classes;

public class DocumentText extends AbstractDoc{

    public DocumentText(String name, int version) {
        this.setName(name);
    }

    @Override
    public String getType() {
        return "Notepad txt doc";
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
