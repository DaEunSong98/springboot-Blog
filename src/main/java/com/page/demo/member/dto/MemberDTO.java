package com.page.demo.member.dto;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


public class MemberDTO {
	

	private int num;
	@NotBlank(message="���̵�� �ʼ� �Է� ���Դϴ�.")
	private String id;
	
	@NotBlank(message="��й�ȣ�´� �ʼ� �Է� ���Դϴ�.")
	//@Pattern(regexp="(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,15}",
 // message = "��й�ȣ�� ���� ��,�ҹ��ڿ� ����, Ư����ȣ�� ��� 1�� �̻� ���Ե� 8�� ~ 15���� ��й�ȣ���� �մϴ�.")
	private String pw;
	
	@NotBlank(message="�̸��� �ʼ� �Է� ���Դϴ�.")
	private String name;
	
	@Email(message = "�̸��� ���Ŀ� ���� �ʽ��ϴ�.")
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