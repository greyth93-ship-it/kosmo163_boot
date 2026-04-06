package com.grey.app.home;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




// 객체 생성 + 역할
@Controller
public class HomeController {
	
//	@Autowired
//	private Robot robot;
	
	@RequestMapping(value ="/", method = RequestMethod.GET)
	public String home() throws Exception {
		
		
		
		
		return "index";	
	}
	
}
