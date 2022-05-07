package com.serbanscorteanu.factory.factorymethod.classes;

public abstract class AbstractDocFactory {

    public abstract AbstractDoc getDocument(DocTypeEnum docType, String docName);
}
