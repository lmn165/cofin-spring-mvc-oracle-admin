package shop.cofin.oracle.publisher.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.cofin.oracle.publisher.domain.PublisherDto;

@Component
public interface PublisherService {
	public List<PublisherDto> findAll();
	public PublisherDto findByPubId(int pubId);
	public List<PublisherDto> findByPubName(String pubName);
	public List<PublisherDto> findByMgrName(String mgrName);
	public List<PublisherDto> findByPhone(String phone);
	public void save(PublisherDto publisher);
}
