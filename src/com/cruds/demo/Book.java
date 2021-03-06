package com.cruds.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {

	private int isbn;
	
	private String title;
	private float price;
	
	@Autowired
	private Author author;
	
	
	public Book(int isbn, String title, float price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
		
	}
	
	public Book(int isbn, String title, float price, Author author) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
		this.author = author;
	}

	public Book()
	{
		
	}
	
	public int getIsbn() {
		return isbn;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + ", author=" + author + "]";
	}
	
	
}
