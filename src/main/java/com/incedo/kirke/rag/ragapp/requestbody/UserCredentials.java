package com.incedo.kirke.rag.ragapp.requestbody;

public class UserCredentials {

	private String email;
	public UserCredentials() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserCredentials(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	
}
