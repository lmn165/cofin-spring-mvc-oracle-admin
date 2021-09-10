package shop.cofin.oracle.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import shop.cofin.oracle.order.domain.OrderDto;
import shop.cofin.oracle.order.service.OrderService;

@Controller
public class OrderController {
	@Autowired OrderService orderService;
	
	@RequestMapping("/orders")
	public void findAll() {
		List<OrderDto> orders = orderService.findAll();
		for(OrderDto order : orders) {
			System.out.println(order.toString());
		}
	}

	@RequestMapping("/orders/orderId/{orderId}")
	public void findByOrderId(@PathVariable int orderId) {
		System.out.println(orderService.findByOrderId(orderId));
	}

	@RequestMapping("/orders/custId/{custId}")
	public void findByCustId(@PathVariable int custId) {
		List<OrderDto> orders = orderService.findByCustId(custId);
		for(OrderDto order : orders) {
			System.out.println(order.toString());
		}
	}

	@RequestMapping("/orders/bookId/{bookId}")
	public void findByBookId(@PathVariable int bookId) {
		List<OrderDto> orders = orderService.findByBookId(bookId);
		for(OrderDto order : orders) {
			System.out.println(order.toString());
		}
	}

	@RequestMapping("/orders/price/{price}")
	public void findByOrderPrice(@PathVariable int price) {
		List<OrderDto> orders = orderService.findByOrderPrice(price);
		for(OrderDto order : orders) {
			System.out.println(order.toString());
		}
	}

	@RequestMapping("/orders/date/{date}")
	public void findByOrderDate(@PathVariable String date) {
		List<OrderDto> orders = orderService.findByOrderDate(date);
		for(OrderDto order : orders) {
			System.out.println(order.toString());
		}
	}
}
