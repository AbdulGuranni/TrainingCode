package com.bookapp.util;

public class Queries {

	public static final String INSERTQUERY = "Insert into book (bookTitle, bookAuthor, bookCategory, bookPrice) values (?,?,?,?);";
    public static final String UPDATEQUERY = "Update book set bookPrice=? where book_id=?";
    public static final String DELETEQUERY = "Delete from book where book_id=?";

    public static final String SELECTQUERY = "Select * from book";
    public static final String SELECTBYAUTHORQUERY = "Select * from book where bookAuthor=?";
    public static final String SELECTBYCATEGORYQUERY = "Select * from book where bookCategory=?";

    public static final String SELECTBYPRICEQUERY = "Select * from book where bookPrice<?";
    public static final String SELECTBYAUTHORCATQUERY = "Select * from book where bookAuthor=? and bookCategory=?";
    public static final String SELECTBYIDQUERY = "Select * from book where book_id=?";
}
