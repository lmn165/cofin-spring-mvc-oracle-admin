package shop.cofin.oracle.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.cofin.oracle.customer.domain.CustomerDto;
import shop.cofin.oracle.customer.service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	@Autowired CustomerService customerService;
	@Autowired CustomerDto customer;
	
	@RequestMapping(value = "/join", method = {RequestMethod.POST})
	public String join(
			@RequestParam("custId") int custId,
			@RequestParam("custName") String custName,
			@RequestParam("address") String address,
			@RequestParam("phone") String phone) {
		System.out.printf("custId : %s\ncustName : %s\naddress : %s\nphone: %s\n", custId, custName, address, phone);
		
		customer = new CustomerDto();
		customer.setCustId(custId);
		customer.setCustName(custName);
		customer.setAddress(address);
		customer.setPhone(phone);
		customerService.save(customer);
		
		return "회원가입 성공";
	}
	
	@RequestMapping(value = "/login", method = {RequestMethod.POST})
	public String login() {
//		return "loginForm";
		return "/user/Login";
	}
	
	@GetMapping("/")
	public void findAll() {
		List<CustomerDto> customers = customerService.findAll();
		for(CustomerDto customer : customers) {
			System.out.println(customer.toString());
		}
	}
	
	@GetMapping("/custId/{custId}")
	public void findByCustId(@PathVariable int custId) {
		System.out.println(customerService.findByCustId(custId));
	}
	
	@GetMapping("/custName/{custName}")
	public void findByCustName(@PathVariable String custName) {
		List<CustomerDto> customers = customerService.findByCustName(custName);
		for(CustomerDto customer : customers) {
			System.out.println(customer.toString());
		}
	}
	
	@GetMapping("/address/{address}")
	public void findByAddress(@PathVariable String address) {
		List<CustomerDto> customers = customerService.findByAddress(address);
		for(CustomerDto customer : customers) {
			System.out.println(customer.toString());
		}
	}
	
	@GetMapping("/phone/{phone}")
	public void findByPhone(@PathVariable String phone) {
		List<CustomerDto> customers = customerService.findByPhone(phone);
		for(CustomerDto customer : customers) {
			System.out.println(customer.toString());
		}
	}
	
}
