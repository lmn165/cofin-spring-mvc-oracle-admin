package shop.cofin.oracle.common;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;


/**
 * Handles requests for the application home page.
 */
@SessionAttributes("contextPath")
@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(
			HttpSession session,
			HttpServletRequest request) {
		String contextPath = request.getContextPath();
		session.setAttribute("contextPath", contextPath);
		return "index";
	}

	@RequestMapping("/user/join")
	public String join() {
		return "/user/Register";
	}
	@RequestMapping("/user/update")
	public String update() {
		return "/user/Update";
	}
	@RequestMapping("/user/detail")
	public String detail() {
		return "/user/Detail";
	}
	@RequestMapping("/user/list")
	public String list() {
		return "/user/List";
	}
	
	// GET 방식은 다음과 같이 생략이 가능하다.(default가 GET..)
	@RequestMapping("/loginform")
	public String login() {
		return "/user/Login";
	}
	
	
	
	@RequestMapping("/book/regist")
	public String bookRegist() {
		return "/book/Register";
	}
	
	@RequestMapping("/book/detail")
	public String bookDetail() {
		return "/book/Detail";
	}
	
	@RequestMapping("/book/update")
	public String bookUpdate() {
		return "/book/Update";
	}

	@RequestMapping("/book/list")
	public String bookList() {
		return "/book/List";
	}
	
	

	@RequestMapping("/publisher/regist")
	public String publisherRegist() {
		return "/publisher/Register";
	}
	
	@RequestMapping("/publisher/detail")
	public String publisherDetail() {
		return "/publisher/Detail";
	}
	
	@RequestMapping("/publisher/update")
	public String publisherUpdate() {
		return "/publisher/Update";
	}
	
	@RequestMapping("/publisher/list")
	public String publisherList() {
		return "/publisher/List";
	}
	
	

	
	@RequestMapping("/order/regist")
	public String orderRegist() {
		return "/order/Register";
	}
	
	@RequestMapping("/order/detail")
	public String orderDetail() {
		return "/order/Detail";
	}

	@RequestMapping("/order/update")
	public String orderUpdate() {
		return "/order/Update";
	}
	
	@RequestMapping("/order/list")
	public String orderList() {
		return "/order/List";
	}
}
