package shop.cofin.oracle.publisher.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.cofin.oracle.common.GenericInterface;
import shop.cofin.oracle.publisher.domain.PublisherDto;
import shop.cofin.oracle.publisher.service.PublisherService;

@Controller
@RequestMapping("/publishers")
public class PublisherController {
	@Autowired PublisherService publisherService;
	@Autowired PublisherDto publisher;
	

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String save(PublisherDto t) {
		publisherService.save(t);
		return "출판사 등록 완료";
	}

	@RequestMapping("/detail/{id}")
	public String findById(@PathVariable Integer id) {
		System.out.println(publisherService.findById(id).toString());
		return "id로 출판사 조회 완료";
	}

	@RequestMapping("/")
	public String findAll() {
		List<PublisherDto> publishers = publisherService.findAll();
		for(PublisherDto publisher : publishers) {
			System.out.println(publisher.toString());
		}
		return "출판사 목록 조회 완료";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(PublisherDto t) {
		publisherService.update(t);
		return "출판사 수정 완료";
	}

	@RequestMapping("/delete")
	public String delete(@PathParam("pubId") Integer pubId) {
		publisherService.delete(pubId);
		return "출판사 삭제 완료";
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
