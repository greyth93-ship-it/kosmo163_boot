package com.grey.app.professor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/professor/*")
public class ProfessorController {
	
	@Autowired
	private ProfessorService professorService;
	
	@GetMapping("list")
	public String list(Model model) throws Exception {
		 List<ProfessorDTO> ar = professorService.list();
		
		 model.addAttribute("list", ar);
		 
		 return "professor/list";
		 
	}
	
	@GetMapping("detail")
	public void detail(ProfessorDTO dto, Model model) throws Exception {
		dto = professorService.detail(dto);
		
		model.addAttribute("d", dto);
		
	}
	
	@GetMapping("create")
	public void create() throws Exception {}
	@PostMapping("create")
	public String create(ProfessorDTO dto) throws Exception {
		int result = professorService.create(dto);
		return "redirect:./list";
		
	}
	@GetMapping("update")
	public void update(ProfessorDTO dto, Model model) throws Exception {
		dto = professorService.detail(dto);
		model.addAttribute("d", dto);
		
	}
	@PostMapping("update")
	public String update(ProfessorDTO dto) throws Exception {
		int reuslt = professorService.update(dto);
		return "redirect:./list";
	}
	
	
	public String delete(ProfessorDTO dto) throws Exception {
		int result = professorService.delete(dto);
		return "redirect:./list";
		
	}

}
