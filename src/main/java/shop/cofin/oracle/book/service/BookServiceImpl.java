package shop.cofin.oracle.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.cofin.oracle.book.domain.BookDto;
import shop.cofin.oracle.mappers.BookMapper;

@Service
public class BookServiceImpl implements BookService {

	@Autowired BookMapper bookMapper;
	
	@Override
	public List<BookDto> findAll() {
		return bookMapper.findAll();
	}

	@Override
	public BookDto findById(int bookId) {
		return bookMapper.findById(bookId);
	}

	@Override
	public List<BookDto> findByPubId(int pubId) {
		return bookMapper.findByPubId(pubId);
	}

	@Override
	public List<BookDto> findByBookTitle(String value) {
		return bookMapper.findByBookTitle(value);
	}

	@Override
	public List<BookDto> findByPrice(int price) {
		return bookMapper.findByPrice(price);
	}

}
