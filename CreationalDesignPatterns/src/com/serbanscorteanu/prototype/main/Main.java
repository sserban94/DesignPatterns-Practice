package com.serbanscorteanu.prototype.main;

import com.serbanscorteanu.prototype.classes.Book;
import com.serbanscorteanu.prototype.classes.BookStore;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookStore bs1 = new BookStore(
                List.of(
                        new Book("title1", "author1", 2000),
                        new Book("title2", "author2", 2000),
                        new Book("title3", "author3", 2000)),
                "address1");
        BookStore bs2;
        BookStore bs3;
        try {
            bs2 = (BookStore) bs1.clone();
            bs3 = (BookStore) bs1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
