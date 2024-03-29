package com.bookapp.service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements IBookService {
    @Override
    public List<Book> getAll() {
        List<Book> books = BookDetails.showBooks();
        return books;
    }

    @Override
    public List<Book> getByAuthorStartWith(String author) throws BookNotFoundException {
        List<Book> books= BookDetails.showBooks();
        List<Book> book1 = new ArrayList<>();
        for(Book book:books){
            if(book.getAuthor().startsWith(author)){
                book1.add(book);
            }
//            else {
//                throw new BookNotFoundException("Author not found");
//            }
        }
        if(book1.isEmpty())
            throw new BookNotFoundException("Author not found");
        return book1;
    }

    @Override
    public List<Book> getCategory(String category) throws BookNotFoundException {
        List<Book> books= BookDetails.showBooks();
        List<Book> bookByCategory = new ArrayList<>();
        for(Book book:books){
            if(book.getCategory().startsWith(category))
                bookByCategory.add(book);
        }
        if(bookByCategory.isEmpty())
            throw new BookNotFoundException("Book not found");
        return bookByCategory;
    }

    @Override
    public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
        List<Book> books= BookDetails.showBooks();
        List<Book> bookByPrice = new ArrayList<>();
        for(Book book:books ){
            if(book.getPrice()<price)
                bookByPrice.add(book);
        }
        if(bookByPrice.isEmpty())
            throw new BookNotFoundException("Book not found");
        return bookByPrice;
    }

    @Override
    public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
        List<Book> books= BookDetails.showBooks();
        List<Book> bookByAuthor = new ArrayList<>();
        for(Book book:books) {
            if (book.getAuthor().equals(author) && book.getCategory().equals(category)) {
                bookByAuthor.add(book);

            }
        }
        if(bookByAuthor.isEmpty())
            throw new BookNotFoundException("Book not found");
        return bookByAuthor;
    }

    @Override
    public List<Book> getById(int bookId) throws IdNotFoundException {
        List<Book> books= BookDetails.showBooks();
        List<Book> bookById = new ArrayList<>();
        for(Book book:books ){
            if((book.getBookId()==bookId))
                return  books;
        }
        if(books.isEmpty())
            throw new IdNotFoundException("ID not found");
        return null;
    }
}
