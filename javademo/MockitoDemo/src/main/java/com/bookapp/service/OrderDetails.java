package com.bookapp.service;

import java.util.Collections;
import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;

public class OrderDetails {
	private IBookService bookService;
	

	public void setBookService(IBookService bookService) {
		this.bookService = bookService;
	}

	public List<Book> showBooks(String author){
		List<Book> books = bookService.getByAuthor(author);
		Collections.sort(books,(b1,b2)->b1.getTitle().compareTo(b2.getTitle()));
		return books;
	}
	
	public List<Book> showNoBooks(String author) throws RuntimeException{
		List<Book> books = bookService.getByAuthor(author);
		if(books.isEmpty())
			throw new BookNotFoundException("Book not found");
		return books;
		
	}
	
	public String orderBook(int bookId) {
		Book book = bookService.getById(bookId);
		return book.getTitle();
	}
	
	public double getTotalPriceByDiscount(double price, int discountAmount) {
		return 0.0;
	}

}
