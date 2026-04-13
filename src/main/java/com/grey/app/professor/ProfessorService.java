package com.grey.app.professor;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grey.app.page.Pager;

@Service
public class ProfessorService {
	
	@Autowired
	private ProfessorMapper professorMapper;
	
	public List<ProfessorDTO> list(Pager pager) throws Exception {
		
		pager.makePageNumber(professorMapper.getCount(pager));
		
		return professorMapper.list(pager);
		
	} 
	
	public ProfessorDTO detail(ProfessorDTO dto) throws Exception {
		return professorMapper.detail(dto);
		
	}
	
	public int create(ProfessorDTO dto) throws Exception {
		return professorMapper.create(dto);
		
	}
	
	public int update(ProfessorDTO dto) throws Exception {
		return professorMapper.update(dto);
	}
	
	public int delete(ProfessorDTO dto) throws Exception {
		return professorMapper.delete(dto);
		
	}

}
