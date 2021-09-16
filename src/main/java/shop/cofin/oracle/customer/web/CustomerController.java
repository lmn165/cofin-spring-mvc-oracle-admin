package shop.cofin.oracle.customer.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.cofin.oracle.customer.model.CustomerDto;
import shop.cofin.oracle.customer.model.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	@Autowired CustomerService customerService;
	@Autowired CustomerDto customer;
	
	@RequestMapping(value = "/register", method = {RequestMethod.POST})
	public String save(CustomerDto customer) {
		customerService.save(customer);
		return "회원가입 성공";
	}

	@RequestMapping("/detail")
	public String findById(@RequestParam("custId") Integer custId) {
		System.out.println(customerService.findById(custId).toString());
		return "id로 회원찾기";
	}

	@RequestMapping
	public String findAll() {
		List<CustomerDto> cutomers = customerService.findAll();
		for (CustomerDto customer : cutomers) {
			System.out.println(customer.toString());
		}
		return "모든 회원 찾기";
	}

	@RequestMapping(value = "/update", method = {RequestMethod.POST})
	public String update(CustomerDto customer) {
		customerService.update(customer);
		return "회원 정보 수정";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam("custId") Integer custId) {
		customerService.delete(custId);
		return "회원 정보 삭제";
	}
	
	
	
	@RequestMapping(value = "/login", method = {RequestMethod.POST})
	public String login(
			@RequestBody CustomerDto customer) {
//		customerService.login(customer);
		return "/user/Login";
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
