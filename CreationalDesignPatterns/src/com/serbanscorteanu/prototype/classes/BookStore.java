package com.serbanscorteanu.prototype.classes;

import java.util.List;

public class BookStore implements Cloneable {
    private List<Book> books;
    private String address;

    public BookStore(){

    }

    public BookStore(List<Book> books, String address){
        this.books = books;
        this.address = address;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // fast way

    @Override
    public Object clone() throws CloneNotSupportedException {
        BookStore copy = new BookStore();
        copy.address = this.address;
        copy.books = List.copyOf(books);
        return copy;
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "books=" + books +
                ", address='" + address + '\'' +
                '}';
    }
}
