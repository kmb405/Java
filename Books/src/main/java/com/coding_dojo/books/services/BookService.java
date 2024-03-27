package com.coding_dojo.books.services;

import java.util.List;
import java.util.Optional;

import com.coding_dojo.books.models.Book;
import com.coding_dojo.books.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	private final BookRepository bookRepository;
	
	public BookRepository getBookRepository() {
		return bookRepository;
	}

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public List<Book> allBooks() {
		return bookRepository.findAll();
	}
	
	public Book createBook(Book b) {
		return bookRepository.save(b);
	}
	
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if (optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}
	
	public Book updateBook(Long id, String title, String desc, String lang, int numOfPages) {
		Book book = bookRepository.findById(id).get();
		book.setTitle(title);
		book.setDescription(desc);
		book.setLanguage(lang);
		book.setNumberOfPages(numOfPages);
		return bookRepository.save(book);
	}
	
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}
}
