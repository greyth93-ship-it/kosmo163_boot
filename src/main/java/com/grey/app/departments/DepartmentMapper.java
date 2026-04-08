package com.grey.app.departments;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper // 오버라이딩, 리턴을 해주겠다
public interface DepartmentMapper {

	
	// list
	public abstract List<DepartmentDTO> list() throws Exception;
	
	// detail
	public DepartmentDTO detail(DepartmentDTO departmentDTO) throws Exception;
	
	// create
	int create(DepartmentDTO departmentDTO) throws Exception;
	
	// update
	int update(DepartmentDTO departmentDTO) throws Exception;
	
	// delete
	public int delete(DepartmentDTO departmentDTO) throws Exception;
	
	
	
	
	
	
	
	
	
	
}
