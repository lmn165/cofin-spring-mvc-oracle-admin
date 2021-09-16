package shop.cofin.oracle.common.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.book.model.BookDto;
import shop.cofin.oracle.common.service.GenericInterface;

@Repository
public interface BookMapper extends GenericInterface<BookDto, Integer> {
	public List<BookDto> findByPubId(int pubId);
	public List<BookDto> findByBookTitle(String value);
	public List<BookDto> findByPrice(int price);
}
