package shop.cofin.oracle.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.cofin.oracle.book.domain.BookDto;
import shop.cofin.oracle.book.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {

@Autowired BookService bookService;
@Autowired BookDto book;

	@RequestMapping(value = "/regist", method = {RequestMethod.POST})
	public String regist(
			@RequestParam int bookId,
			@RequestParam String bookTitle,
			@RequestParam int price,
			@RequestParam int pubId) {
		System.out.println("book Id: " + bookId);
		book = new BookDto();
		book.setBookId(bookId);
		book.setBookTitle(bookTitle);
		book.setPrice(price);
		book.setPubId(pubId);
		bookService.save(book);
		
		return "도서 등록 완료";
	}
	
	@RequestMapping("/")
	public void findAll() {
		List<BookDto> books = bookService.findAll();
		for(BookDto book : books) {
			System.out.println(book.toString());
		}
	}
	
	@RequestMapping("/bookId/{bookId}")
	public void findById(@PathVariable int bookId) {
		BookDto book = bookService.findById(bookId);
		System.out.println(book.toString());
	}
	
	@RequestMapping("/pubId/{pubId}")
	public void findByPubId(@PathVariable int pubId) {
		List<BookDto> books = bookService.findByPubId(pubId);
		for(BookDto book : books) {
			System.out.println(book.toString());
		}
	}
	
	@RequestMapping("/bookTitle/{bookTitle}")
	public void findByBookTitle(@PathVariable String bookTitle) {
		List<BookDto> books = bookService.findByBookTitle(bookTitle);
		for(BookDto book : books) {
			System.out.println(book.toString());
		}
	}
	
	@RequestMapping("/price/{price}")
	public void findByPrice(@PathVariable int price) {
		List<BookDto> books = bookService.findByPrice(price);
		for(BookDto book : books) {
			System.out.println(book.toString());
		}
	}
	
}
