package com.page.demo.member.service;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestParam;

import com.page.demo.member.dao.MemberMappers;
import com.page.demo.member.dto.MemberDTO;

@Service
public class MemberService {

	@Autowired
	MemberMappers mapper;


	public void insert(MemberDTO dto) {
		
	mapper.insert(dto);	
	
	}


	public int login(@RequestParam(value="id") String id,
			@RequestParam(value="pw") String pw, HttpSession session) {
		
		MemberDTO tmp = mapper.selectId(id);
		if(tmp != null && id != "") {
			if(tmp.getPw().equals(pw)) {
				session.setAttribute("member",tmp );
				return 1;
			}
		}
		return 0;
	}


	public void update(MemberDTO dto) {
		// TODO Auto-generated method stub
		mapper.update(dto);
	}


	public void delete(String id, String pw, String pw_check) {
		// TODO Auto-generated method stub
		MemberDTO dto=mapper.selectId(id);
		if(pw!="") {
			if(pw.equals(pw_check)&& dto.getPw().equals(pw)) {
				mapper.delete(id); 
			}
		}
	}


	public Map<String, String> validateHandling(BindingResult result) {
		// TODO Auto-generated method stub
		Map<String, String> validResult=new HashMap<String, String>();
		
		for(FieldError error: result.getFieldErrors()) {
			String keyName=String.format("valid_%s", error.getField());
			validResult.put(keyName, error.getDefaultMessage());
		}
		return validResult;
	}

}



