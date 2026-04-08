package com.grey.app.professor;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProfessorMapperTest {
	
	@Autowired
	private ProfessorMapper professorMapper;
	
//	@Test
	void testList() throws Exception {
		List<ProfessorDTO> dto = professorMapper.list();
		assertNotEquals(0, dto);
		
		
//		fail("Not yet implemented");
	}

//	@Test
	void testDetail() throws Exception {
		ProfessorDTO dto = new ProfessorDTO();
		dto.setProfessorNo("P001");
		
		dto = professorMapper.detail(dto);
		
		assertNotNull(dto);
	
//		fail("Not yet implemented");
	}

//	@Test
	void testCreate() throws Exception {
		ProfessorDTO dto = new ProfessorDTO();
		dto.setProfessorNo("P200");
		dto.setProfessorName("test");
		dto.setProfessorSsn("901212-1234567");
		dto.setProfessorAddress("test");
		dto.setDepartmentNo("001");

		int result = professorMapper.create(dto);
		
		assertNotNull(result);
//		fail("Not yet implemented");
	}

	@Test
	void testUpdate() throws Exception {
		ProfessorDTO dto = new ProfessorDTO();
		
		dto.setProfessorNo("P200");
		dto.setProfessorName("test12");
		dto.setProfessorSsn("891212-1234567");
		dto.setProfessorAddress("서울시");
		dto.setDepartmentNo("001");
		
		int result = professorMapper.update(dto);
		assertNotNull(dto);
		
		
//		fail("Not yet implemented");
	}

//	@Test
	void testDelete() throws Exception {
		ProfessorDTO dto = new ProfessorDTO();
		
		dto.setProfessorNo("P200");
		
		int result = professorMapper.delete(dto);
		assertNull(dto);
//		fail("Not yet implemented");
	}

}
