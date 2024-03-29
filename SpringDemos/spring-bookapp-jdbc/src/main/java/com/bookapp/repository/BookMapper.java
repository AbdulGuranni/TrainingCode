package com.bookapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bookapp.model.Book;

public class BookMapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		Book book = new Book();
		book.setAuthor(rs.getString("bookAuthor"));
		book.setBookId(rs.getInt("book_id"));
		book.setTitle(rs.getString("bookTitle"));
		book.setCategory(rs.getString("bookCategory"));
		book.setPrice(rs.getDouble("bookPrice"));
		return book;
	}


}
