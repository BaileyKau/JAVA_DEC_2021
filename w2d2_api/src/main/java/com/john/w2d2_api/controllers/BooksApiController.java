package com.john.w2d2_api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.john.w2d2_api.models.Book;
import com.john.w2d2_api.services.BookService;

@RestController
public class BooksApiController {

//	--- dependency injection -----
	private final BookService bookService;

	public BooksApiController(BookService bookService) {
		this.bookService = bookService;
	}
//	-----------------

	@RequestMapping("/api/books")
	public List<Book> index() {
		return bookService.allBooks();
	}

	@RequestMapping(value = "/api/books", method = RequestMethod.POST)
	public Book create(@RequestParam(value = "title") String title, 
					   @RequestParam(value = "description") String desc,
					   @RequestParam(value = "language") String lang, 
					   @RequestParam(value = "pages") Integer numOfPages) {
		Book book = new Book(title, desc, lang, numOfPages);
		return bookService.createBook(book);
	}

	@RequestMapping("/api/books/{id}")
	public Book show(@PathVariable("id") Long id) {
		Book book = bookService.findBook(id);
		return book;
	}
	
//	UPDATE method 1
	@RequestMapping(value = "/api/books1/{id}", method = RequestMethod.PUT)
	public Book update1(@PathVariable("id") Long bookId,
						@RequestParam(value = "title") String title, 
					   @RequestParam(value = "description") String desc,
					   @RequestParam(value = "language") String lang, 
					   @RequestParam(value = "pages") Integer numOfPages) {
		
		Book updatedBook = bookService.EditById(bookId, title, desc, lang, numOfPages);
		return updatedBook;
	}
	
//	UPDATE method 2
	@RequestMapping(value = "/api/books2/{id}", method = RequestMethod.PUT)
	public Book update2(@PathVariable("id") Long bookId,
						@RequestParam(value = "title") String title, 
					   @RequestParam(value = "description") String desc,
					   @RequestParam(value = "language") String lang, 
					   @RequestParam(value = "pages") Integer numOfPages) {
		
//		1. find the book to update
		Book bookToUpdate = bookService.findBook(bookId);
		bookToUpdate.setTitle(title);
		bookToUpdate.setDescription(desc);
		bookToUpdate.setLanguage(lang);
		bookToUpdate.setNumberOfPages(numOfPages);
		
		return bookService.updateWholeBook(bookToUpdate);
		
	}
	
	

}














