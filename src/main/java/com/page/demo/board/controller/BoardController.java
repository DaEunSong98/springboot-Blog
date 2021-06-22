package com.page.demo.board.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.page.demo.board.dto.BoardDTO;
import com.page.demo.board.service.BoardService;
import com.page.demo.member.dto.MemberDTO;

@Controller
public class BoardController {

	@Autowired
	BoardService bs;
	
	
	@GetMapping("home")
		public String Home() {
		return "Home";
	}
	
	@GetMapping("/board/list")
	public String ListBoard(Model model) {
		bs.list(model);
		return "Board/list";
	}
	
	
	@GetMapping("/board/insert")
	public String GetInsertBoard() {
		return "Board/insert";
	}
	
	@PostMapping("/board/insert")
	public String PostInsertBoard(BoardDTO dto ,HttpSession session) {
		try {
			MemberDTO member=(MemberDTO) session.getAttribute("member");
			if(member==null) {
				//�α��� �ض� 
				return "Member/login";
			}
			else {
				dto.setWriter(member.getId());
				bs.insert(dto);
			
			}
		}
		catch(DataAccessException e) {} //�����ͺ��̽� ó�� ������ ����
		catch(Exception e) {} 	//�ý��ۿ� ���� 
		return "Board/insert";
	}
	
	@GetMapping("/board/view")
	public String GetViewBoard(@RequestParam("idx") int idx, Model model) {
		bs.view(idx,model);
		return "Board/view";
	}
	
	@GetMapping("/board/update")
	public String GetUpdateBoard(@RequestParam("idx") int idx, Model model) {
		bs.view(idx, model);
		return "Board/update";
	}
	
	@PostMapping("/board/update")
	public String PostUpdateBoard(BoardDTO dto) {
	
		bs.update(dto);
		return "Home";
	}
	
	@GetMapping("/board/delete")
	public String GetDeleteBoard(@RequestParam("idx") int idx) {
		bs.delete(idx);
		return "Board/delete";
	}
	
}