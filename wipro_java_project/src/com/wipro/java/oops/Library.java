/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
abstract class Library {

	private String bookTitle;
	private String author;
	private int bookId;
	
	abstract void book();
	public Library(String bookTitle, String author, int bookId) {
		// TODO Auto-generated constructor stub
		this.bookTitle = bookTitle;
        this.author = author;
        this.bookId = bookId;
	}
	
	
	public Library() {
		// TODO Auto-generated constructor stub
	}
	public String getBookTitle() {
		return bookTitle;
	}


	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

}
