package shop.cofin.oracle.book.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.cofin.oracle.common.mapper.BookMapper;


@Service
public class BookServiceImpl implements BookService {

	@Autowired BookMapper bookMapper;
	
	@Override
	public List<BookDto> findAll() {
		return bookMapper.findAll();
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

	@Override
	public void save(BookDto book) {
		bookMapper.save(book);
	}

	@Override
	public BookDto findById(Integer id) {
		return bookMapper.findById(id);
	}

	@Override
	public void update(BookDto t) {
		bookMapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		bookMapper.delete(id);
	}

}
