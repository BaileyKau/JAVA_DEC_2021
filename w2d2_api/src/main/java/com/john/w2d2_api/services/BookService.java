package com.john.w2d2_api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.john.w2d2_api.models.Book;
import com.john.w2d2_api.repositories.BookRepository;

@Service
public class BookService {

//	----- DEPEDENCY INJECTION --- 
	 // adding the book repository as a dependency
    private final BookRepository bookRepository;
//    constructor ---
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
//    ----------------------
    
    
//    READ ALL
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    
//    CREATE
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    
//    READ ONE
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
}
