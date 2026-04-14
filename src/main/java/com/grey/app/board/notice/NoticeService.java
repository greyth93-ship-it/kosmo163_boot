package com.grey.app.board.notice;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import com.grey.app.page.Pager;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class NoticeService {
	
	@Autowired
	private NoticeMapper noticeMapper;
	
	@Value("${app.upload.base}")
	private String filePath;
	
	@Value("${app.board.notice}")
	private String notice;
	
	
	public List<NoticeDTO> list(Pager pager)throws Exception{
		pager.makePageNumber(noticeMapper.getCount(pager));
		
		return noticeMapper.list(pager);
	}
	
	
	public int create(NoticeDTO dto, MultipartFile attach) throws Exception {
		// 1. 어디에 저장?
		log.info(filePath);
		String filePath = this.filePath+this.notice;
		
		// 2. 어떤 이름으로 저장할 것인가?
		String fileName = UUID.randomUUID().toString();
		
//		log.warn(fileName);
//		
//		// 2-2. 확장자
//		log.error(attach.getOriginalFilename());
//		String f = attach.getOriginalFilename();
//		f = f.substring(f.lastIndexOf("."));
//		log.info(f);
		
		
		fileName = fileName + "_" + attach.getOriginalFilename();
		
		
		// 3. 저장
		File file = new File(filePath);
		
		if (!file.exists()) {
			file.mkdirs();
		}
		
		file = new File(file, fileName);
		
		
		// 3-1. 파일 저장
		attach.transferTo(file);
		
		// 3-2. 파일 저장 Spring에서 제공 Class
//		FileCopyUtils.copy(attach.getBytes(), file);
		
		
		
		
		
		
		return 0; //noticeMapper.create(dto);
	}
	
	
	public NoticeDTO detail(NoticeDTO noticeDTO) throws Exception {
		
		return noticeMapper.detail(noticeDTO);
	}


}

