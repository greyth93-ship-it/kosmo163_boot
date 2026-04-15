package com.grey.app.board.qna;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.grey.app.page.Pager;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class QnaService {
	
	@Autowired
	private QnaMapper qnaMapper;
	
	@Value("${app.upload.base}")
	private String filePath;
	
	@Value("${app.board.qna}")
	private String qna;
	
	
	
	public List<QnaDTO> list(Pager pager) throws Exception {
		pager.makePageNumber(qnaMapper.getCount(pager));
		return qnaMapper.list(pager);
	}
	
	
	public QnaDTO detail(QnaDTO qnaDTO) throws Exception {
		return qnaMapper.detail(qnaDTO);
		
		
	}
	
	public int create(QnaDTO qnaDTO, MultipartFile [] attach) throws Exception{
		
		int result = qnaMapper.create(qnaDTO);
		
		
		// 1. 어디에 저장?
		log.info(filePath);
		String filePath = this.filePath + this.qna;
		
		if (attach == null) {
			return result;
		}
		
		for (MultipartFile m: attach) {
			
			if(m.isEmpty()) {
				continue;
			}
		
		// 2. 어떤 이름으로 저장할 것인가?
		String fileName = UUID.randomUUID().toString();
		
		fileName = fileName + "_" + m.getOriginalFilename();
		
		// 3. 저장
		File file = new File(filePath);
		
		if (!file.exists()) {
			file.mkdirs();
		}
		
		file = new File(file, fileName);
		
		// 3-1. 파일 저장
		m.transferTo(file);
		
		// 4. DB에 저장
		QnaFileDTO qnaFileDTO = new QnaFileDTO();
		qnaFileDTO.setFileName(fileName);
		qnaFileDTO.setOriName(m.getOriginalFilename());
		qnaFileDTO.setArticleNo(qnaDTO.getArticleNo());
		
		result = qnaMapper.createFile(qnaFileDTO);
		
		
		}
		
		return result;
	}
	
	
	public int replyCreate(QnaDTO qnaDTO) throws Exception {
		QnaDTO parent = qnaMapper.detail(qnaDTO);
		
		// 답글의 REF
		qnaDTO.setArticleRef(parent.getArticleRef());
		// 답글의 STEP
		qnaDTO.setArticleStep(parent.getArticleStep()+1);
		// 답글의 DEPTH
		qnaDTO.setArticleDepth(parent.getArticleDepth()+1);
		
		
		int result = qnaMapper.replyUpdate(parent);
		
		result = qnaMapper.create(qnaDTO);
		
		return result;
				
		
	}
}
