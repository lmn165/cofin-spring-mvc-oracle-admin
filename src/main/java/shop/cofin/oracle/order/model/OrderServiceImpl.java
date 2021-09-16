package shop.cofin.oracle.order.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.cofin.oracle.common.mapper.OrderMapper;



@Service
public class OrderServiceImpl implements OrderService{
	@Autowired OrderMapper orderMapper;

	@Override
	public List<OrderDto> findAll() {
		return orderMapper.findAll();
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

	@Override
	public OrderDto findById(Integer id) {
		return orderMapper.findById(id);
	}

	@Override
	public void update(OrderDto t) {
		orderMapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		orderMapper.delete(id);
	}

	
	
}
