package shop.cofin.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.book.domain.BookDto;

@Repository
public interface BookMapper {
	public List<BookDto> findAll();
	public BookDto findById(int bookId);
	public List<BookDto> findByPubId(int pubId);
	public List<BookDto> findByBookTitle(String value);
	public List<BookDto> findByPrice(int price);
}
