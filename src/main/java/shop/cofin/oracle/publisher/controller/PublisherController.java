package shop.cofin.oracle.publisher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import shop.cofin.oracle.publisher.domain.PublisherDto;
import shop.cofin.oracle.publisher.service.PublisherService;

@Controller
public class PublisherController {
	@Autowired PublisherService publisherService;
	
	@RequestMapping("/publishers")
	public void findAll() {
		List<PublisherDto> publishers = publisherService.findAll();
		for(PublisherDto publisher : publishers) {
			System.out.println(publisher.toString());
		}
	}

	@RequestMapping("/publishers/pubId/{pubId}")
	public void findByPubId(@PathVariable int pubId) {
		System.out.println(publisherService.findByPubId(pubId));
	}

	@RequestMapping("/publishers/pubName/{pubName}")
	public void findByPubName(@PathVariable String pubName) {
		List<PublisherDto> publishers = publisherService.findByPubName(pubName);
		for(PublisherDto publisher : publishers) {
			System.out.println(publisher.toString());
		}
	}

	@RequestMapping("/publishers/mgrName/{mgrName}")
	public void findByMgrName(@PathVariable String mgrName) {
		List<PublisherDto> publishers = publisherService.findByMgrName(mgrName);
		for(PublisherDto publisher : publishers) {
			System.out.println(publisher.toString());
		}
	}

	@RequestMapping("/publishers/phone/{phone}")
	public void findByPhone(@PathVariable String phone) {
		List<PublisherDto> publishers = publisherService.findByPhone(phone);
		for(PublisherDto publisher : publishers) {
			System.out.println(publisher.toString());
		}
	}
}
