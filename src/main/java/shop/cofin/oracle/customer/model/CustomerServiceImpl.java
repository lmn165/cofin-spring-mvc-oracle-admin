package shop.cofin.oracle.customer.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.cofin.oracle.common.mapper.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired CustomerMapper customerMapper;
	
	@Override
	public List<CustomerDto> findAll() {
		return customerMapper.findAll();
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

	@Override
	public void save(CustomerDto customer) {
		customerMapper.save(customer);
	}

	@Override
	public CustomerDto findById(Integer id) {
		return customerMapper.findById(id);
	}

	@Override
	public void update(CustomerDto t) {
		customerMapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		customerMapper.delete(id);
	}

}
