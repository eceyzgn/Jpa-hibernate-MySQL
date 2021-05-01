package com.proje.test;

import com.proje.model.Book;
import com.proje.repository.BookRepository;
import com.proje.repository.impl.BookRepositorImpl;

public class TestUpdate {

	public static void main(String[] args) {
		
		BookRepository bookRepository = new BookRepositorImpl();
		
		Book book = bookRepository.find(100);
		
		book.setTopic("Science-Fiction");
		
		bookRepository.update(book);
	}
}
