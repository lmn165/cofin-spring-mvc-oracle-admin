package shop.cofin.oracle.book.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class BookDto {

	private int bookId;
	private String bookTitle;
	private int price;
	private int pubId;
	
	@Override
	public String toString() {
		
		return String.format("책ID: %d, 책제목: %s, 책가격: %d, 출판사ID: %d", bookId, bookTitle, price, pubId);
	}
}
