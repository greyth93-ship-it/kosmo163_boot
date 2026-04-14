package com.grey.app.board.notice;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.ui.Model;

import com.grey.app.page.Pager;

@Mapper
public interface NoticeMapper {
	
	public int createFile(NoticeFileDTO noticeFileDTO) throws Exception;
	
	public Long getCount(Pager pager) throws Exception;

	public List<NoticeDTO> list(Pager pager)throws Exception;
	
	public NoticeDTO detail(NoticeDTO dto) throws Exception;
	
	public int create(NoticeDTO dto) throws Exception;
	
	public int update(NoticeDTO dto) throws Exception;
	
	public int delete(NoticeDTO dto) throws Exception;
}
