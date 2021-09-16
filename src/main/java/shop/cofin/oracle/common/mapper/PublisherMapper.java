package shop.cofin.oracle.common.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.common.service.GenericInterface;
import shop.cofin.oracle.publisher.model.PublisherDto;

@Repository
public interface PublisherMapper extends GenericInterface<PublisherDto, Integer>{
	public List<PublisherDto> findByPubName(String pubName);
	public List<PublisherDto> findByMgrName(String mgrName);
	public List<PublisherDto> findByPhone(String phone);
}
