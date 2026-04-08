package com.grey.app.departments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentMapper departmentDAO;
	
	public List<DepartmentDTO> list() throws Exception {
		return departmentDAO.list();
	}
	
	
	
	public DepartmentDTO detail(DepartmentDTO departmentDTO) throws Exception {
		return departmentDAO.detail(departmentDTO);
		
	}
	
	public int create(DepartmentDTO dto) throws Exception {
		return departmentDAO.create(dto);
	}
	
	public int delete(DepartmentDTO dto) throws Exception {
		return departmentDAO.delete(dto);
	}
	
	public int update(DepartmentDTO dto) throws Exception {
		return departmentDAO.update(dto);
	}
	
	
}
