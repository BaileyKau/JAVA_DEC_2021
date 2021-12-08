package com.john.w2d2_api.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.john.w2d2_api.models.Book;
import com.john.w2d2_api.services.BookService;

@Controller
public class BookController {
	
//	--- dependency injection -----
	private final BookService bookService;

	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@RequestMapping("/")
	public String redirectMe() {
		System.out.println("----- inside redirect");
		return "redirect:/books";
	}

    @RequestMapping("/books")
    public String index(Model model) {
    	System.out.println("---- inside /books");
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "/books/index.jsp";
    }
}
