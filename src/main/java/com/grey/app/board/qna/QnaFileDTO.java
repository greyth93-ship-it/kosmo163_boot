package com.grey.app.board.qna;

import com.grey.app.files.FileDTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class QnaFileDTO extends FileDTO {

	private Long articleNo;
}
