package shop.cofin.oracle.customer.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class CustomerDto {

	private int custId;
	private String custName, address, phone;
	
	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return String.format("고객ID: %d, 고객 이름: %s, 주소 : %s, 전화번호: %s", custId, custName, address, phone);
	}
}
