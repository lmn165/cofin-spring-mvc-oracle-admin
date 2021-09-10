package shop.cofin.oracle.book.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.cofin.oracle.book.domain.BookDto;


@Component
public interface BookService {

	public List<BookDto> findAll();
	public BookDto findById(int bookId);
	public List<BookDto> findByPubId(int pubId);
	public List<BookDto> findByBookTitle(String value);
	public List<BookDto> findByPrice(int price);
}
