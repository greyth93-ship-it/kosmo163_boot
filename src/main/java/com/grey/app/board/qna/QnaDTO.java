package com.grey.app.board.qna;

import java.util.List;

import com.grey.app.board.BoardDTO;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class QnaDTO extends BoardDTO {
	
	private Long articleRef;
	private Long articleStep;
	private Long articleDepth;
	
	private List<QnaFileDTO> list;
	
	
}
