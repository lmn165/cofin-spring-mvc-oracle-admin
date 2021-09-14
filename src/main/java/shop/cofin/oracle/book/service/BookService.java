package shop.cofin.oracle.book.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.cofin.oracle.book.domain.BookDto;
import shop.cofin.oracle.common.GenericInterface;


@Component
public interface BookService extends GenericInterface<BookDto, Integer>{

	public List<BookDto> findByPubId(int pubId);
	public List<BookDto> findByBookTitle(String value);
	public List<BookDto> findByPrice(int price);
}
