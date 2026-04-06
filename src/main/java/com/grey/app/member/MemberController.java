package com.grey.app.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

//annotation 설명 + 기능
@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	
	
	
//	3번 방법
	@RequestMapping(value = "join",method = RequestMethod.POST)
	public void join(MemberDTO dto) {
		// 파라미터 이름과 dto의 setter이름이 일치
		// 타입도 동일
		
		System.out.println(dto.getAge());
		
		
	}
	
//	2번 방법
//	@RequestMapping(value = "join",method = RequestMethod.POST)
//	public void join(@RequestParam(name = "name") String name, @RequestParam(name = "age") Integer age) {
//		
//		MemberDTO dto = new MemberDTO();
//		dto.setName(name);
//		dto.setAge(age);
//		
//		System.out.println(age);
//	}
	
//	1번 방법
//	@RequestMapping(value = "join",method = RequestMethod.POST)
//	public void join(HttpServletRequest request) {
//		String name = request.getParameter("name");
//		String age = request.getParameter("age");
//		String birth = request.getParameter("birth");
//		String [] nums = request.getParameterValues("num");
//	}
	
	@RequestMapping(value = "join",method = RequestMethod.GET)
	public String join() {
//		System.out.println("회원 가입 페이지");
		
		return "member/join";
	}
	
	@RequestMapping ("login")
	public String login() {
		return "member/login";
	}
	
}
