package shop.cofin.oracle.publisher.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class PublisherDto {
	private int pubId;
	private String pubName, mgrName, phone;
	
	@Override
	public String toString() {
		return String.format("출판사ID: %d, 출판사 이름: %s, 매니저 이름: %s, 전화번호: %s", pubId, pubName, mgrName, phone);
	}
}
