package com.serbanscorteanu.factory.factorymethod.classes;

public class ClassicDocFactory extends AbstractDocFactory{
    public static final int DEFAULT_WORD_VERSION = 1;
    public static final int DEFAULT_NOTEPAD_VERSION = 2;


    @Override
    public AbstractDoc getDocument(DocTypeEnum docType, String docName) {
        switch(docType) {
            case WORD:
                return new DocumentWord(docName, DEFAULT_WORD_VERSION, true, 2);
            case HTML:
                return new DocumentHtml(docName, false);
            case TEXT:
                return new DocumentText(docName, DEFAULT_NOTEPAD_VERSION);
            default:
                throw new UnsupportedOperationException();
        }
    }
}
