package com.cg.lib.dao;

import java.util.List;

import com.cg.lib.exception.LibException;
import com.cg.lib.model.Book;

public interface BookDao  {

	void addBook(Book book) throws LibException;
	
	void updateBook(Book book) throws LibException;
	
	void deleteBook(Book book) throws LibException;
	
	List<Book> getAllBooks() throws LibException;
	
	Book getBookByID(int bookCode);
}
