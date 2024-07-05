package com.example.BookNest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookNest.entities.Book;
import com.example.BookNest.repository.BookRepository;
import com.example.BookNest.services.BookServices;

@RestController
@CrossOrigin
public class MyController {
	
	@Autowired
    private BookServices bookServices;
	
	@GetMapping("/getBooks")
	public Iterable<Book> getAllBooks(){
		
		return bookServices.findAllBooks();
		
	}
	
	@PostMapping("/addBook")
	public String addBook(@RequestBody Book b) {
		return bookServices.addBook(b);
		
	}
	
	@GetMapping("/{id}")
	public Book searchBook(@PathVariable int id){
		return bookServices.searchBook(id);
	}

}
