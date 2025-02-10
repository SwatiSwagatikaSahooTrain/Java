package com.wipro.java.usecase2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
	private List<BookInfo> books;  // Changed to BookInfo for abstraction

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(BookInfo book) {
        books.add(book);
    }

    // Method to display all books in the library
    public void displayAllBooks() {
        books.forEach(BookInfo::displayBookInfo);  // Polymorphism in action
    }

    // Method to get books by author using Java 8 Stream API
    public List<BookInfo> getBooksByAuthor(String author) {
        return books.stream()
                .filter(book -> book instanceof Book && ((Book) book).getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    // Method to get books that cost less than a specified price
    public List<BookInfo> getBooksUnderPrice(double price) {
        return books.stream()
                .filter(book -> book instanceof Book && ((Book) book).getPrice() < price)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // Create Library object
        Library library = new Library();

        // Add books to the library (Including PrintedBook)
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99));
        library.addBook(new PrintedBook("1984", "George Orwell", 12.99, 328));
        library.addBook(new PrintedBook("To Kill a Mockingbird", "Harper Lee", 8.99, 281));
        library.addBook(new Book("Pride and Prejudice", "Jane Austen", 7.99));

        // Display all books in the library
        System.out.println("All Books in Library:");
        library.displayAllBooks();

        // Get books by a specific author (Java 8 Stream API)
        System.out.println("\nBooks by George Orwell:");
        library.getBooksByAuthor("George Orwell").forEach(BookInfo::displayBookInfo);

        // Get books under a certain price (Java 8 Stream API)
        System.out.println("\nBooks under $9:");
        library.getBooksUnderPrice(9).forEach(BookInfo::displayBookInfo);
    }
}