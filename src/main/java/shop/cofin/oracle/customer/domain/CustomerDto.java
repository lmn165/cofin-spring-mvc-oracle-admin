package shop.cofin.oracle.customer.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class CustomerDto {

	private int custId;
	private String custName, address, phone;
	
	@Override
	public String toString() {
		return String.format("고객ID: %d, 고객 이름: %s, 주소 : %s, 전화번호: %s", custId, custName, address, phone);
	}
}
