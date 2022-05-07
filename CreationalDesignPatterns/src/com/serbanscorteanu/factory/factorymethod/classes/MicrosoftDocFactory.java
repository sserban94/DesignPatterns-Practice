package com.serbanscorteanu.factory.factorymethod.classes;

public class MicrosoftDocFactory extends AbstractDocFactory{

    public static final int DEFAULT_NOTEPAD_VERSION = 1;
    @Override
    public AbstractDoc getDocument(DocTypeEnum docType, String docName) {
        switch (docType){
            case WORD:
                return new DocumentText(docName, DEFAULT_NOTEPAD_VERSION);
            default:
                throw new UnsupportedOperationException();
        }
    }
}
