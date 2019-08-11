package com.example.users.dto;

import java.util.Calendar;

import com.example.users.model.User;

public class UserDto {
	private String name;
	private String email;
	private String phone;
	private long id;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "UserDto [name=" + name + ", email=" + email + ", phone=" + phone + ", id=" + id + "]";
	}
	
	public UserDto(String name, String email, String phone, long id) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.id = id;
	}
	public UserDto() {
		
	}
	
	public User toEntityUser() {
		User user = new User();
		user.setEmail(this.email);
		user.setName(this.name);
		user.setPhone(this.phone);
		user.setUpdatedDate(Calendar.getInstance().getTime());
		return user;
	}
}
