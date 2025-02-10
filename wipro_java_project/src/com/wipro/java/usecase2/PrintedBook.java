package com.wipro.java.usecase2;

//Subclass of Book to represent an Printedbook (Inheritance)
class PrintedBook extends Book {
private int numberOfPages;  // Specific attribute for printed books

// Constructor for PrintedBook
public PrintedBook(String title, String author, double price, int numberOfPages) {
    super(title, author, price);
    this.numberOfPages = numberOfPages;
}

// Getters and Setters for additional properties
public int getNumberOfPages() {
    return numberOfPages;
}

public void setNumberOfPages(int numberOfPages) {
    this.numberOfPages = numberOfPages;
}

// Overriding the displayBookInfo method to display more information for printed books
@Override
public void displayBookInfo() {
    // Super refers to the parent class's method to display basic information
    super.displayBookInfo();
    System.out.println(" Pages: " + numberOfPages);
}
}