package com.grey.app.departments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentDAO departmentDAO;
	
	public List<DepartmentDTO> list() {
		return departmentDAO.list();
	}
	
	
	
	public DepartmentDTO detail(String num) {
		return departmentDAO.detail(num);
		
	}
	
	public int create(DepartmentDTO dto) {
		return departmentDAO.create(dto);
	}
	
	public int delete(DepartmentDTO dto) {
		return departmentDAO.delete(dto);
	}
	
	public int update(DepartmentDTO dto) {
		return departmentDAO.update(dto);
	}
	
	
}
