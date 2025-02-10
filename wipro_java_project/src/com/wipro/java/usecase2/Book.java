package com.wipro.java.usecase2;

//Abstract class for common book functionality
abstract class BookInfo {
// Abstract method that will be implemented by subclasses
public abstract void displayBookInfo();
}

class Book extends BookInfo {
private String title;
private String author;
private double price;

// Constructor
public Book(String title, String author, double price) {
   this.title = title;
   this.author = author;
   this.price = price;
}

// Getters and Setters (Encapsulation)
public String getTitle() {
   return title;
}

public void setTitle(String title) {
   this.title = title;
}

public String getAuthor() {
   return author;
}

public void setAuthor(String author) {
   this.author = author;
}

public double getPrice() {
   return price;
}

public void setPrice(double price) {
   this.price = price;
}

// Overriding displayBookInfo method (Polymorphism)
@Override
public void displayBookInfo() {
   System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
}
}