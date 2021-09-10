package shop.cofin.oracle.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import shop.cofin.oracle.customer.domain.CustomerDto;
import shop.cofin.oracle.customer.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired CustomerService customerService;
	
	@GetMapping("/customers")
	public void findAll() {
		List<CustomerDto> customers = customerService.findAll();
		for(CustomerDto customer : customers) {
			System.out.println(customer.toString());
		}
	}
	
	@GetMapping("/customers/custId/{custId}")
	public void findByCustId(@PathVariable int custId) {
		System.out.println(customerService.findByCustId(custId));
	}
	
	@GetMapping("/customers/custName/{custName}")
	public void findByCustName(@PathVariable String custName) {
		List<CustomerDto> customers = customerService.findByCustName(custName);
		for(CustomerDto customer : customers) {
			System.out.println(customer.toString());
		}
	}
	
	@GetMapping("/customers/address/{address}")
	public void findByAddress(@PathVariable String address) {
		List<CustomerDto> customers = customerService.findByAddress(address);
		for(CustomerDto customer : customers) {
			System.out.println(customer.toString());
		}
	}
	
	@GetMapping("/customers/phone/{phone}")
	public void findByPhone(@PathVariable String phone) {
		List<CustomerDto> customers = customerService.findByPhone(phone);
		for(CustomerDto customer : customers) {
			System.out.println(customer.toString());
		}
	}
	
}
