package shop.cofin.oracle;


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
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(
			HttpSession session,
			HttpServletRequest request) {
		String contextPath = request.getContextPath();
		session.setAttribute("contextPath", contextPath);
		return "index";
	}
	
	@RequestMapping(value = "/joinform", method = RequestMethod.GET)
	public String join() {
		return "/user/Join";
	}
	
	// GET 방식은 다음과 같이 생략이 가능하다.(default가 GET..)
	@RequestMapping("/loginform")
	public String login() {
		return "/user/Login";
	}
	
	@RequestMapping("/registBook")
	public String bookRegist() {
		return "/book/regist";
	}
	
	@RequestMapping("/registPublisher")
	public String publisherRegist() {
		return "/publisher/regist";
	}
	
	@RequestMapping("/registOrder")
	public String orderRegist() {
		return "/order/regist";
	}
}
