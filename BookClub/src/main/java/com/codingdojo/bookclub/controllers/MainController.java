package com.codingdojo.bookclub.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.codingdojo.bookclub.models.Book;
import com.codingdojo.bookclub.models.LoginUser;
import com.codingdojo.bookclub.models.User;
import com.codingdojo.bookclub.services.BookServ;

@Controller
public class MainController {
	
	@Autowired
	private BookServ bookServ;
	
	
	@GetMapping("/")
    public String index(@ModelAttribute("newUser") User newUser, @ModelAttribute("newLogin") LoginUser newLogin) {
        return "index.jsp";
    }
    
    @GetMapping("/shelves")
    public String shelves(Model model) {
    	List<Book> books = bookServ.allBooks();
    	model.addAttribute("books", books);
    	return "shelves.jsp";
    }
    
    @GetMapping("/createBook")
    public String newBook(@ModelAttribute("newBook") Book newBook) {
    	return "new.jsp";
    }
    
    @GetMapping("/updateBook/{id}")
    public String editBook(@PathVariable("id") Long id, Model model) {
    	Book book = bookServ.findBook(id);
    	model.addAttribute("book", book);
    	return "edit.jsp";
    }
    
    @GetMapping("/viewBook/{id}")
    public String viewBook(@PathVariable("id") Long id, Model model) {
    	Book book = bookServ.findBook(id);
    	model.addAttribute("book", book);
    	return "review.jsp";
    }	
    	
}
