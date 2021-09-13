package shop.cofin.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.order.domain.OrderDto;

@Repository
public interface OrderMapper {
	public List<OrderDto> findAll();
	public OrderDto findByOrderId(int orderId);
	public List<OrderDto> findByCustId(int custId);
	public List<OrderDto> findByBookId(int bookId);
	public List<OrderDto> findByOrderPrice(int orderPrice);
	public List<OrderDto> findByOrderDate(String orderDate);
	public void save(OrderDto order);
}
