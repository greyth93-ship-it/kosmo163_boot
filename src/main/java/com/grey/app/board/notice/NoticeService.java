package com.grey.app.board.notice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grey.app.page.Pager;

@Service
public class NoticeService {
	
	@Autowired
	private NoticeMapper noticeMapper;
	
	
	public List<NoticeDTO> list(Pager pager)throws Exception{
		
		pager.makePageNumber(noticeMapper.getCount(pager));
		
		
		
		return noticeMapper.list(pager);
	}
	
	public int create(NoticeDTO dto) throws Exception {
		
		return noticeMapper.create(dto);
	}


}

