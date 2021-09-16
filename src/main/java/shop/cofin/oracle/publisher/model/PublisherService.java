package shop.cofin.oracle.publisher.model;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.cofin.oracle.common.service.GenericInterface;

@Component
public interface PublisherService extends GenericInterface<PublisherDto, Integer>{
	public List<PublisherDto> findByPubName(String pubName);
	public List<PublisherDto> findByMgrName(String mgrName);
	public List<PublisherDto> findByPhone(String phone);
}
