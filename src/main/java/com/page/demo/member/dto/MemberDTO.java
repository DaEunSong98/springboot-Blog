package com.page.demo.member.dto;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


public class MemberDTO {
	

	private int num;
	@NotBlank(message="아이디는 필수 입력 값입니다.")
	private String id;
	
	@NotBlank(message="비밀반호는는 필수 입력 값입니다.")
	//@Pattern(regexp="(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,15}",
 // message = "비밀번호는 영문 대,소문자와 숫자, 특수기호가 적어도 1개 이상씩 포함된 8자 ~ 15자의 비밀번호여야 합니다.")
	private String pw;
	
	@NotBlank(message="이름은 필수 입력 값입니다.")
	private String name;
	
	@Email(message = "이메일 형식에 맞지 않습니다.")
	private String email;
	private String mobile;
	private String address;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}