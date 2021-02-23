package com.company;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

class MyBook extends Book{

    private int price;

    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    @Override
    void display() {
        System.out.println("Title: " + this.title +
                          "\nAuthor: " + this.author +
                           "\nPrice: " + this.price);
    }
}

public class Solution {

    public static void main(String[] args) {
	// write your code here
    }
}
