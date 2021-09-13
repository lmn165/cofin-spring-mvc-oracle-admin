package shop.cofin.oracle.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.cofin.oracle.order.domain.OrderDto;
import shop.cofin.oracle.order.service.OrderService;

@Controller
@RequestMapping("/orders")
public class OrderController {
	@Autowired OrderService orderService;
	@Autowired OrderDto order;
	
	@RequestMapping(value = "/regist", method = {RequestMethod.POST})
	public String regist(
			@RequestParam int orderId,
			@RequestParam int custId,
			@RequestParam int bookId,
			@RequestParam int orderPrice,
			@RequestParam String orderDate
			) {
		order = new OrderDto();
		order.setOrderId(orderId);
		order.setCustId(custId);
		order.setBookId(bookId);
		order.setOrderPrice(orderPrice);
		order.setOrderDate(orderDate);
		
		orderService.save(order);
		
		return "주문 등록 완료";
	}
	
	@RequestMapping("/")
	public void findAll() {
		List<OrderDto> orders = orderService.findAll();
		for(OrderDto order : orders) {
			System.out.println(order.toString());
		}
	}

	@RequestMapping("/orderId/{orderId}")
	public void findByOrderId(@PathVariable int orderId) {
		System.out.println(orderService.findByOrderId(orderId));
	}

	@RequestMapping("/custId/{custId}")
	public void findByCustId(@PathVariable int custId) {
		List<OrderDto> orders = orderService.findByCustId(custId);
		for(OrderDto order : orders) {
			System.out.println(order.toString());
		}
	}

	@RequestMapping("/bookId/{bookId}")
	public void findByBookId(@PathVariable int bookId) {
		List<OrderDto> orders = orderService.findByBookId(bookId);
		for(OrderDto order : orders) {
			System.out.println(order.toString());
		}
	}

	@RequestMapping("/price/{price}")
	public void findByOrderPrice(@PathVariable int price) {
		List<OrderDto> orders = orderService.findByOrderPrice(price);
		for(OrderDto order : orders) {
			System.out.println(order.toString());
		}
	}

	@RequestMapping("/date/{date}")
	public void findByOrderDate(@PathVariable String date) {
		List<OrderDto> orders = orderService.findByOrderDate(date);
		for(OrderDto order : orders) {
			System.out.println(order.toString());
		}
	}
}
