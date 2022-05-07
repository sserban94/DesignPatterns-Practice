package com.serbanscorteanu.factory.factorymethod.classes;

public class DocumentWord extends AbstractDoc{
    private int version;

    public DocumentWord(String title, int version, boolean hasMetadata, int compatibilityVersion) {
        this.setName(title);
        this.version = version;
    }

    @Override
    public String getType() {
        return "MSWord Document for text";
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
