package com.grey.app.board.notice;

import com.grey.app.files.FileDTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class NoticeFileDTO extends FileDTO {
	
	private Long articleNo;
}
