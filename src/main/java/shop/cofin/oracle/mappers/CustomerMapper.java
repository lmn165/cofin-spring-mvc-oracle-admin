package shop.cofin.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.customer.domain.CustomerDto;

@Repository
public interface CustomerMapper {
	public List<CustomerDto> findAll();
	public CustomerDto findByCustId(int custId);
	public List<CustomerDto> findByCustName(String custName);
	public List<CustomerDto> findByAddress(String address);
	public List<CustomerDto> findByPhone(String phone);
	public void save(CustomerDto customer);
}
