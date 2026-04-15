package com.grey.app.board.qna;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class QnaMapperTest {
	
	@Autowired
	private QnaMapper qnaMapper;
	
	@Test
	void testCreate() throws Exception {
		
		
		QnaDTO qnaDTO = new QnaDTO();
		qnaDTO.setArticleTitle("답글2");
		qnaDTO.setArticleContent("답글내용2");
		qnaDTO.setArticleWriter("user2");
		qnaDTO.setArticleRef(19L);
		qnaDTO.setArticleStep(2L);
		qnaDTO.setArticleDepth(2L);
		
		
		
		
		int result = qnaMapper.create(qnaDTO);
		assertEquals(1, result);
		
	}

}
