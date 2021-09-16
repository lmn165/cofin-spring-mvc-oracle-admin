package shop.cofin.oracle.book.web;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.cofin.oracle.book.model.BookDto;
import shop.cofin.oracle.book.model.BookService;

@Controller
@RequestMapping("/books")
public class BookController {

@Autowired BookService bookService;
@Autowired BookDto book;

	@RequestMapping
	public String findAll() {
		List<BookDto> books = bookService.findAll();
		for(BookDto book : books) {
			System.out.println(book.toString());
		}
		return "redirect:/move/home/intro";
	}
	
	@RequestMapping("/detail")
	public String findById(@RequestParam("bookId") int bookId) {
		BookDto book = bookService.findById(bookId);
		System.out.println(book.toString());
		return "bookId로 도서 조회 완료";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(BookDto book) {
		bookService.update(book);
		return "도서 업데이트 완료";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam("bookId") Integer bookId) {
		bookService.delete(bookId);
		return "도서 삭제 완료";
	}
	
	@RequestMapping(value = "/register", method = {RequestMethod.POST})
	public String save(BookDto book) {
		bookService.save(book);
		return "도서 등록 완료";
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
