package shop.cofin.oracle.publisher.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class PublisherDto {
	private int pubId;
	private String pubName, mgrName, phone;
	
	public int getPubId() {
		return pubId;
	}

	public void setPubId(int pubId) {
		this.pubId = pubId;
	}

	public String getPubName() {
		return pubName;
	}

	public void setPubName(String pubName) {
		this.pubName = pubName;
	}

	public String getMgrName() {
		return mgrName;
	}

	public void setMgrName(String mgrName) {
		this.mgrName = mgrName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return String.format("출판사ID: %d, 출판사 이름: %s, 매니저 이름: %s, 전화번호: %s", pubId, pubName, mgrName, phone);
	}
}
