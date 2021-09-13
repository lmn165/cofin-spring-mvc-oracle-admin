package shop.cofin.oracle.publisher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.cofin.oracle.publisher.domain.PublisherDto;
import shop.cofin.oracle.publisher.service.PublisherService;

@Controller
@RequestMapping("/publishers")
public class PublisherController {
	@Autowired PublisherService publisherService;
	@Autowired PublisherDto publisher;
	
	@RequestMapping(value = "/regist", method = {RequestMethod.POST})
	public String regist(
			@RequestParam int pubId,
			@RequestParam String pubName,
			@RequestParam String mgrName,
			@RequestParam String phone
			) {
		publisher = new PublisherDto();
		publisher.setPubId(pubId);
		publisher.setPubName(pubName);
		publisher.setMgrName(mgrName);
		publisher.setPhone(phone);
		publisherService.save(publisher);
		
		return "출판사 등록 완료";
	}
	
	@RequestMapping("/")
	public void findAll() {
		List<PublisherDto> publishers = publisherService.findAll();
		for(PublisherDto publisher : publishers) {
			System.out.println(publisher.toString());
		}
	}

	@RequestMapping("/pubId/{pubId}")
	public void findByPubId(@PathVariable int pubId) {
		System.out.println(publisherService.findByPubId(pubId));
	}

	@RequestMapping("/pubName/{pubName}")
	public void findByPubName(@PathVariable String pubName) {
		List<PublisherDto> publishers = publisherService.findByPubName(pubName);
		for(PublisherDto publisher : publishers) {
			System.out.println(publisher.toString());
		}
	}

	@RequestMapping("/mgrName/{mgrName}")
	public void findByMgrName(@PathVariable String mgrName) {
		List<PublisherDto> publishers = publisherService.findByMgrName(mgrName);
		for(PublisherDto publisher : publishers) {
			System.out.println(publisher.toString());
		}
	}

	@RequestMapping("/phone/{phone}")
	public void findByPhone(@PathVariable String phone) {
		List<PublisherDto> publishers = publisherService.findByPhone(phone);
		for(PublisherDto publisher : publishers) {
			System.out.println(publisher.toString());
		}
	}
}
