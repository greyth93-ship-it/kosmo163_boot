package com.grey.app.board.notice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.grey.app.professor.ProfessorDTO;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class NoticeMapperTest {
	
	@Autowired
	private NoticeMapper noticeMapper; 
	
	@Test
	void detailTest() throws Exception{
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setArticleNo(165L);
		
		noticeDTO = noticeMapper.detail(noticeDTO);
		log.info("Map : {}", noticeDTO);
		assertNotNull(noticeDTO);
	}
	
//	@Test
//	void getCount() throws Exception {
//		Long result = noticeMapper.getCount();
//		assertNotEquals(0, result);
//	}
//	
	
//	@Test
//	void testList() throws Exception {
//		List<NoticeDTO> ar = noticeMapper.list();
//		
//		assertNotEquals(0, ar.size());
//		
//	}
	
//	@Test
//	void testCreate() throws Exception {
//		int idx=1;
//		for(int i=0; i<110; i++) {
//			NoticeDTO dto = new NoticeDTO();
//			dto.setArticleTitle("test"+i);
//			dto.setArticleContent("teeeeeest"+i);
//			dto.setArticleWriter("P00"+idx);
//			int result = noticeMapper.create(dto);
//			idx++;
//			if(idx>9) {
//				idx=1;
//			}
//			if (i%10 ==0) {
//				
//				Thread.sleep(1000);
//			}
//		}
//		System.out.println("finish");
////		fail("Not yet implemented");
//	}

}
