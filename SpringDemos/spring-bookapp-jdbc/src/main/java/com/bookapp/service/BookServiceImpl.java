package com.bookapp.service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.repository.IBookRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookServiceImpl implements IBookService {
	@Autowired
	private IBookRepository bookRepository;
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		bookRepository.addBook(book);
	}

	@Override
	public void updateBook(int bookId, double price) {
		// TODO Auto-generated method stub
		bookRepository.updateBook(bookId, price);
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		bookRepository.deleteBook(bookId);
		
	}

	@Override
	public List<Book> getAll() {
		List<Book> books = bookRepository.findAll();
		return books;
	}

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		List<Book> books = bookRepository.findByAuthorContains(author);
		if(books.isEmpty())
			throw new BookNotFoundException("Book Not Found");
		else
			return books;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		List<Book> books = bookRepository.findByCategory(category);
		if(books.isEmpty())
			throw new BookNotFoundException("Book Not Found");
		else
			return books;
	}

	@Override
	public List<Book> getByLesserPrice(double price) throws BookNotFoundException {
		List<Book> books = bookRepository.findByLesserPrice(price);
		if(books.isEmpty())
			throw new BookNotFoundException("Book Not Found");
		else
			return books;
	}

	@Override
	public List<Book> getByAuthorCategory(String author, String category) throws BookNotFoundException {
		List<Book> books = bookRepository.findByAuthorCategory(author, category);
		if(books.isEmpty())
			throw new BookNotFoundException("Book Not Found");
		else
			return books;
	}

	@Override
	public Book getById(int bookId) throws IdNotFoundException {
		Book book = bookRepository.findById(bookId);
		if(book==null)
			throw new IdNotFoundException("Id not found");
		else
			return book;
	}
    
}
