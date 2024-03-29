package com.bookapp.repository;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.Queries;

import java.util.List;



import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
@Repository
public class BookRepositoryImpl implements IBookRepository {
	private JdbcTemplate jdbcTemplate;
	
	public BookRepositoryImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		Object[] BookArr = {book.getTitle(),book.getAuthor(),book.getCategory(),book.getPrice()};
		jdbcTemplate.update(Queries.INSERTQUERY,BookArr);
		
	}

	@Override
	public void updateBook(int bookId, double price) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(Queries.UPDATEQUERY, bookId,price);
		
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(Queries.DELETEQUERY, bookId);
		
	}

	@Override
	public List<Book> findAll() {
		RowMapper<Book> mapper = new BookMapper();
		List<Book> books = jdbcTemplate.query(Queries.SELECTQUERY, mapper);
		return books;
	}

	@Override
	public List<Book> findByAuthorContains(String author) throws BookNotFoundException {
	
		return jdbcTemplate.query(Queries.SELECTBYAUTHORQUERY, (rs, rowNum)->{
			Book book = new Book();
			book.setAuthor(rs.getString("bookAuthor"));
			book.setBookId(rs.getInt("book_id"));
			book.setTitle(rs.getString("bookTitle"));
			book.setCategory(rs.getString("bookCategory"));
			book.setPrice(rs.getDouble("bookPrice"));
			return book;
		},author);
	}

	@Override
	public List<Book> findByCategory(String category) throws BookNotFoundException {
		List<Book> books = jdbcTemplate.query(Queries.SELECTBYCATEGORYQUERY, new BookMapper(),category);
		return books;
	}

	@Override
	public List<Book> findByLesserPrice(double price) throws BookNotFoundException {
		List<Book> books = jdbcTemplate.query(Queries.SELECTBYPRICEQUERY, new BookMapper(),price);
		return books;
	}

	@Override
	public List<Book> findByAuthorCategory(String author, String category) throws BookNotFoundException {
		List<Book> books = jdbcTemplate.query(Queries.SELECTBYAUTHORCATQUERY, new BookMapper(),author,category);
		return books;
	}

	@Override
	public Book findById(int bookId) throws IdNotFoundException {
		Book book =jdbcTemplate.queryForObject(Queries.SELECTBYIDQUERY, new BookMapper(),bookId);
		return book;
	}
    
}
