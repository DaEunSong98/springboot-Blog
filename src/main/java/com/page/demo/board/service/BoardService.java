package com.page.demo.board.service;

import java.util.Date;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.page.demo.board.dto.BoardDTO;
import com.page.demo.board.mapper.BoardMapper;

@Service
public class BoardService {

	@Autowired
	BoardMapper mapper;
	
	static private int num=1;
	public void insert(BoardDTO dto) {
		// TODO Auto-generated method stub
		
		dto.setWdate(new Date(System.currentTimeMillis()));
		dto.setIdx(num++);
		System.out.println(dto.getContents());
		mapper.insert(dto);
	}


	public void list(Model model) {
		// TODO Auto-generated method stub
		ArrayList<BoardDTO> list=new ArrayList<BoardDTO>();
		list=mapper.list();
		model.addAttribute("list",list);
	}


	public void view(int idx, Model model) {
		// TODO Auto-generated method stub
		BoardDTO dto=mapper.selectIdx(idx);
		model.addAttribute("dto",dto);
	}



	public void update(BoardDTO dto) {
		// TODO Auto-generated method stub
		mapper.update(dto);
	}


	public void delete(int idx) {
		// TODO Auto-generated method stub
		mapper.delete(idx);
	}


	
	

}
