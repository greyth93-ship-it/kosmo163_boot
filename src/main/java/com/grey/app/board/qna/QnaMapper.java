package com.grey.app.board.qna;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.grey.app.page.Pager;

@Mapper
public interface QnaMapper {
	
	public int createFile(QnaFileDTO qnaFileDTO) throws Exception;
	
	public Long getCount(Pager pager) throws Exception;
	
	public List<QnaDTO> list(Pager pager) throws Exception;
	
	public QnaDTO detail (QnaDTO qnaDTO) throws Exception;
	
	public int create(QnaDTO qnaDTO) throws Exception;
	
	public int replyUpdate(QnaDTO qnaDTO) throws Exception;
	
	
}
