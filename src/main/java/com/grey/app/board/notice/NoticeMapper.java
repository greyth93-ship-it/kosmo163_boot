package com.grey.app.board.notice;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.ui.Model;

@Mapper
public interface NoticeMapper {

	public List<NoticeDTO> list() throws Exception;
	
	public NoticeDTO detail(NoticeDTO dto) throws Exception;
	
	public int create(NoticeDTO dto) throws Exception;
	
	public int update(NoticeDTO dto) throws Exception;
	
	public int delete(NoticeDTO dto) throws Exception;
}
