package com.wipro.java.oops;

class Fictional extends Library{
	
	private String genre;

	public Fictional(String bookTitle, String author, int bookId, String genre) {
		// TODO Auto-generated constructor stub
		super(author, bookTitle, bookId);
		this.genre=genre;
	}

	void book() {
		// TODO Auto-generated method stub
		System.out.println("Book Id: " + getBookId() + " Title: " + getBookTitle() + " Author: " + getAuthor() + " Genre: " + genre);
		
	}
	
	public static void main(String[] args) {
		 Library book1 = new Fictional("Harry Potter", "J.K. Rowling", 101, "Fantasy");
		 book1.book();
	}

}
