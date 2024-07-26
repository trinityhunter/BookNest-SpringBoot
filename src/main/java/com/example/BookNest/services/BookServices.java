package com.example.BookNest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.example.BookNest.entities.Book;
import com.example.BookNest.repository.BookRepository;

@Service
public class BookServices {
	
	@Autowired
    private BookRepository bookRepo;
	
	public Iterable<Book> findAllBooks(){
		
		return bookRepo.findAll();
				
	}
	
	public String addBook(Book b) {
		
		 bookRepo.save(b);
		 return "book added";
		
	}
	
	public Book searchBook(int id) {
		
		return bookRepo.findById(id).get();
		
	}
	
	public void deleteBook(int id) {
		bookRepo.deleteById(id);
	}
	
}
