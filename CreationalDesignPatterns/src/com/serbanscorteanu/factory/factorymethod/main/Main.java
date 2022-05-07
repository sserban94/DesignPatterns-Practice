package com.serbanscorteanu.factory.factorymethod.main;

import com.serbanscorteanu.factory.factorymethod.classes.*;

public class Main {

    public static void main(String[] args) {
//        AbstractDoc htmlDoc = new DocumentHtml("index.html", true);
//        AbstractDoc msWordDoc = new DocumentWord("course.docx", 12, true, 10);
//        AbstractDoc notepadDoc = new DocumentText("untitled.txt", 1);

        // FACTORY METHOD WAY
        ClassicDocFactory docFactory = new ClassicDocFactory();
        AbstractDoc msWordDoc = docFactory.getDocument(DocTypeEnum.WORD, "course.docx");
    }
}
