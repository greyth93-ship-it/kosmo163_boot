package com.grey.app.departments;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDAO {
	
	@Autowired
	private SqlSession session;
	private final String NAMESPACE="com.grey.app.departments.DepartmentDAO.";
	
	// 어느 namespace의 어떤 id를 가진 쿼리 태그를 실행할 것인가
	public List<DepartmentDTO> list() {
		// 사용하려는 mapper의 namespace.id 
		return session.selectList(NAMESPACE+"list");
	}
	
	public DepartmentDTO detail(String num) {
		return session.selectOne(NAMESPACE+"detail",num);
	}
	
	public int create(DepartmentDTO dto) {
		return session.insert(NAMESPACE+"create", dto);
	}
	
	public int update(DepartmentDTO dto) {
		return session.update(NAMESPACE+"update",dto);
	}
	
	public int delete(DepartmentDTO dto) {
		return session.delete(NAMESPACE+"delete",dto);
	}
	
	
	
}
