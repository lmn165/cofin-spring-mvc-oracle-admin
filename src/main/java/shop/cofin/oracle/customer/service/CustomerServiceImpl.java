package shop.cofin.oracle.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.cofin.oracle.customer.domain.CustomerDto;
import shop.cofin.oracle.mappers.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired CustomerMapper customerMapper;
	
	@Override
	public List<CustomerDto> findAll() {
		return customerMapper.findAll();
	}

	@Override
	public CustomerDto findByCustId(int custId) {
		return customerMapper.findByCustId(custId);
	}

	@Override
	public List<CustomerDto> findByCustName(String custName) {
		return customerMapper.findByCustName(custName);
	}

	@Override
	public List<CustomerDto> findByAddress(String address) {
		return customerMapper.findByAddress(address);
	}

	@Override
	public List<CustomerDto> findByPhone(String phone) {
		return customerMapper.findByPhone(phone);
	}

}
