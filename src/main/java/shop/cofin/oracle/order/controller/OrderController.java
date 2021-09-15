package shop.cofin.oracle.order.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.cofin.oracle.common.GenericInterface;
import shop.cofin.oracle.order.domain.OrderDto;
import shop.cofin.oracle.order.service.OrderService;

@Controller
@RequestMapping("/orders")
public class OrderController {
	@Autowired OrderService orderService;
	@Autowired OrderDto order;
	
	@RequestMapping(value = "/register", method = {RequestMethod.POST})
	public String save(OrderDto order) {
		orderService.save(order);
		return "주문 등록 완료";
	}

//	@RequestMapping(value = "/orderId", method = {RequestMethod.POST})
//	public String findById(@RequestBody OrderDto order) {
//		orderService.findById(order.getOrderId());
//		return "주문 번호로 조회 완료";
//	}

	@RequestMapping
	public String findAll() {
		List<OrderDto> orders = orderService.findAll();
		for(OrderDto order : orders) {
			System.out.println(order.toString());
		}
		return "전체 주문 내역 조회";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(OrderDto order) {
		orderService.update(order);
		return "주문 수정 완료";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam("orderId") Integer orderId) {
		orderService.delete(orderId);
		return "주문 취소";
	}
	
	@RequestMapping("/detail")
	public String findById(@RequestParam("orderId") Integer orderId) {
		System.out.println(orderService.findById(orderId).toString());
		return "orderId로 주문 찾기";
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
