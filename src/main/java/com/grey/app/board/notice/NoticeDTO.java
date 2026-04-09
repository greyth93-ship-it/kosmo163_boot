package com.grey.app.board.notice;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class NoticeDTO {

	private Long articleNo;
	private String articleTitle;
	private String articleContent;
	private Long articleHit;
	private LocalDateTime articleDate;
	private String articleWriter;
	
	
}
