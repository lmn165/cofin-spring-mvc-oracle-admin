package shop.cofin.oracle.customer.model;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.cofin.oracle.common.service.GenericInterface;

@Component
public interface CustomerService extends GenericInterface<CustomerDto, Integer> {
	public List<CustomerDto> findByCustName(String custName);
	public List<CustomerDto> findByAddress(String address);
	public List<CustomerDto> findByPhone(String phone);
}
