package com.proje.test;

import com.proje.model.Book;
import com.proje.repository.BookRepository;
import com.proje.repository.impl.BookRepositorImpl;

public class TestFind {

	public static void main(String[] args) {
		
		BookRepository bookRepository = new BookRepositorImpl();
		
		Book book = bookRepository.find(101);
		
		if(book != null) {
			System.out.println(book);
		}else {
			System.out.println("Book Not Found");
		}
		
	}
}
