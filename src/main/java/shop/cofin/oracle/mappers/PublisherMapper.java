package shop.cofin.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.publisher.domain.PublisherDto;

@Repository
public interface PublisherMapper {
	public List<PublisherDto> findAll();
	public PublisherDto findByPubId(int pubId);
	public List<PublisherDto> findByPubName(String pubName);
	public List<PublisherDto> findByMgrName(String mgrName);
	public List<PublisherDto> findByPhone(String phone);
}
