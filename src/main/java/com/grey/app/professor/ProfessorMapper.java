package com.grey.app.professor;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.grey.app.page.Pager;

@Mapper

public interface ProfessorMapper {
	
	// page
	public Long getCount(Pager pager) throws Exception;
	
	// list
	public List<ProfessorDTO> list(Pager pager) throws Exception;
	
	// detail
	public ProfessorDTO detail(ProfessorDTO professorDTO) throws Exception;
	
	// create
	public int create(ProfessorDTO professorDTO) throws Exception;
	
	// update
	public int update(ProfessorDTO professorDTO) throws Exception;
	
	// delete
	public int delete(ProfessorDTO professorDTO) throws Exception;
	
	

}
