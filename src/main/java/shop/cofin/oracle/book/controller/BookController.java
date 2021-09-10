package shop.cofin.oracle.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import shop.cofin.oracle.book.domain.BookDto;
import shop.cofin.oracle.book.service.BookService;

@Controller
public class BookController {

@Autowired BookService bookService;
	
	@RequestMapping("/books")
	public void findAll() {
		List<BookDto> books = bookService.findAll();
		for(BookDto book : books) {
			System.out.println(book.toString());
		}
	}
	
	@RequestMapping("/books/bookId/{bookId}")
	public void findById(@PathVariable int bookId) {
		BookDto book = bookService.findById(bookId);
		System.out.println(book.toString());
	}
	
	@RequestMapping("/books/pubId/{pubId}")
	public void findByPubId(@PathVariable int pubId) {
		List<BookDto> books = bookService.findByPubId(pubId);
		for(BookDto book : books) {
			System.out.println(book.toString());
		}
	}
	
	@RequestMapping("/books/bookTitle/{bookTitle}")
	public void findByBookTitle(@PathVariable String bookTitle) {
		List<BookDto> books = bookService.findByBookTitle(bookTitle);
		for(BookDto book : books) {
			System.out.println(book.toString());
		}
	}
	
	@RequestMapping("/books/price/{price}")
	public void findByPrice(@PathVariable int price) {
		List<BookDto> books = bookService.findByPrice(price);
		for(BookDto book : books) {
			System.out.println(book.toString());
		}
	}
	
}
