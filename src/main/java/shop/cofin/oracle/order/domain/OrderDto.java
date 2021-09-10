package shop.cofin.oracle.order.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class OrderDto {
	private int orderId, custId, bookId, orderPrice;
	private String orderDate;
	
	@Override
	public String toString() {
		return String.format("주문ID: %d, 고객ID: %d, 책ID: %d, 주문가격: %d, 주문날짜: %s", orderId, custId, bookId, orderPrice, orderDate);
	}
}
