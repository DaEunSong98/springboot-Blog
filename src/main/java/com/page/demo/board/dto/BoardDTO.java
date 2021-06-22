package com.page.demo.board.dto;

import java.util.Date;

public class BoardDTO {

	int idx;
	String writer;
	String title;
	String contents;
	Date Wdate;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getWdate() {
		return Wdate;
	}
	public void setWdate(Date wdate) {
		Wdate = wdate;
	}

	
	
}