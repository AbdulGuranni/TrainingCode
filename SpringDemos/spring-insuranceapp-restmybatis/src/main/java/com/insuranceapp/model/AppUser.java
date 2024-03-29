package com.insuranceapp.model;

import java.util.List;

public class AppUser {
	private Integer userId;
	private String username;
	private String password;
	private List<String> authorities;
	private String email;
	public AppUser() {
		super();
	}
	public AppUser(Integer userId, String username, String password, List<String> authorities, String email) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.authorities = authorities;
		this.email = email;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<String> getAuthorities() {
		return authorities;
	}
	public void setAuthorities(List<String> authorities) {
		this.authorities = authorities;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "AppUser [userId=" + userId + ", username=" + username + ", password=" + password + ", authorities="
				+ authorities + ", email=" + email + "]";
	}
	
	

}
