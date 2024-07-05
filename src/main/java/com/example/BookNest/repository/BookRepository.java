package com.example.BookNest.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.BookNest.entities.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
