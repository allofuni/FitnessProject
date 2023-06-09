package com.project.file.model.entity.member;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Member {
	private long mem_no;
	private String mail;
	private String password;
	private String mem_id;
	private String language;
	private int status;
	private String name;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birth;
	private String gender;
	private String phone;
	private String image;
	private String intro;
	private double height;
	private int skill;
	private int days;
	private int cardio;
	private String recent;
	
	
	public Member(long mem_no, String mail, String password, String mem_id, String name, LocalDate birth, String gender) {
		this.mem_no = mem_no;
		this.mail = mail;
		this.password = password;
		this.mem_id = mem_id;
		this.name = name;
		this.birth = birth;
		this.gender = gender;
	}


	public Member(String mail, String password) {
		this.mail = mail;
		this.password = password;
	}


	public Member(String mail, String name, String phone) {
		this.mail = mail;
		this.name = name;
		this.phone = phone;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
