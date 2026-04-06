package com.grey.app.departments;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentDAO dao;
	
	
	public List<DepartmentDTO> list() throws Exception {
		System.out.println("Service List");
		// 메서드 호출
		// 참조변수명.메서드명()
		
		List<DepartmentDTO> ar = this.dao.list();
	
		return ar;
	}

}
