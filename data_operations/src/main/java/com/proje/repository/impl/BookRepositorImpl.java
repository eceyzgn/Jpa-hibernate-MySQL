package com.proje.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.proje.factory.Factory;
import com.proje.factory.impl.FactoryImpl;
import com.proje.model.Book;
import com.proje.repository.BookRepository;

public class BookRepositorImpl implements BookRepository{

	private Factory factory = new FactoryImpl(); 
		
	private EntityManager entityManager = factory.getEntityManager();
	
	private EntityTransaction transaction = factory.getEntityTransaction();
	
	@Override
	public void save(Book book) {
		
		transaction.begin();
		
		this.entityManager.persist(book);
		
		transaction.commit();
	}

	@Override
	public void delete(Book book) {
		
		this.transaction.begin();
		
		this.entityManager.remove(book);

		transaction.commit();
	}

	@Override
	public Book find(int id) {
		
		Book book = this.entityManager.find(Book.class, id);
		
		if(book != null) {
		return book;
		}
		return null;
	}

	@Override
	public Book update(Book book) {
		
		transaction.begin();
		
		Book updateBook = this.entityManager.merge(book);
		
		transaction.commit();
		
		return updateBook;
	}

}
