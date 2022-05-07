package com.serbanscorteanu.factory.factorymethod.classes;

public class DocumentHtml extends AbstractDoc{
    boolean hadHeader;

    public DocumentHtml(String name, boolean hadHeader) {
        this.setName(name);
        this.hadHeader = hadHeader;
    }

    @Override
    public String getType() {
        return "HTML doc";
    }

    @Override
    public void print(String text) {
        System.out.println("<p>" + text + "</p>");
    }
}
