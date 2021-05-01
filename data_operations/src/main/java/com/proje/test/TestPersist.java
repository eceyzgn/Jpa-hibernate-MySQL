package com.proje.test;

import java.util.Calendar;
import java.util.Date;

import com.proje.model.Book;
import com.proje.repository.BookRepository;
import com.proje.repository.impl.BookRepositorImpl;

public class TestPersist {

	public static void main(String[] args) {
		
		BookRepository bookRepository = new BookRepositorImpl();
		
		Book book1 = new Book(100, "Momo",302,"Fantastic", "Micheal Ende", createCustomDate(01,01,2005));
	
		Book book2 = new Book(101,"The Lord of The Rings",1000,"Fantastic", "J. R. R. Tolkien", createCustomDate(29, 07, 1954));
		
		bookRepository.save(book1);
		bookRepository.save(book2);
	}
	
	public static Date createCustomDate(int day, int month, int year) {
		
		Calendar calender = Calendar.getInstance();
		
		calender.set(Calendar.DAY_OF_MONTH, day);
		calender.set(Calendar.MONTH, month);
		calender.set(Calendar.YEAR, year);
		
		return calender.getTime();
	}
}
