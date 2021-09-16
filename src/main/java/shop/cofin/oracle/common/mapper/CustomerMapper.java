package shop.cofin.oracle.common.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.common.service.GenericInterface;
import shop.cofin.oracle.customer.model.CustomerDto;

@Repository
public interface CustomerMapper extends GenericInterface<CustomerDto, Integer>{
	public List<CustomerDto> findByCustName(String custName);
	public List<CustomerDto> findByAddress(String address);
	public List<CustomerDto> findByPhone(String phone);
}
