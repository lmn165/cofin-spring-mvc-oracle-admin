package shop.cofin.oracle.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.cofin.oracle.mappers.OrderMapper;
import shop.cofin.oracle.order.domain.OrderDto;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired OrderMapper orderMapper;

	@Override
	public List<OrderDto> findAll() {
		return orderMapper.findAll();
	}

	@Override
	public OrderDto findByOrderId(int orderId) {
		return orderMapper.findByOrderId(orderId);
	}

	@Override
	public List<OrderDto> findByCustId(int custId) {
		return orderMapper.findByCustId(custId);
	}

	@Override
	public List<OrderDto> findByBookId(int bookId) {
		return orderMapper.findByBookId(bookId);
	}

	@Override
	public List<OrderDto> findByOrderPrice(int orderPrice) {
		return orderMapper.findByOrderPrice(orderPrice);
	}

	@Override
	public List<OrderDto> findByOrderDate(String orderDate) {
		return orderMapper.findByOrderDate(orderDate);
	}

	@Override
	public void save(OrderDto order) {
		orderMapper.save(order);
	}

	
	
}
