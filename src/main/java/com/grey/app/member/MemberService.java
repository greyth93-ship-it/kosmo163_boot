package com.grey.app.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	// 전처리 후처리
	// business 
	
	
	@Autowired
	private MemberDAO memberDAO;
}
