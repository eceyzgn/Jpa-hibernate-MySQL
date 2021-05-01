package com.proje.test;

import com.proje.model.Book;
import com.proje.repository.BookRepository;
import com.proje.repository.impl.BookRepositorImpl;

public class TestDelete {

	public static void main(String[] args) {
		 
		BookRepository bookRepository = new BookRepositorImpl();
		
		Book book = bookRepository.find(100);
		
		bookRepository.delete(book);
	}
}
