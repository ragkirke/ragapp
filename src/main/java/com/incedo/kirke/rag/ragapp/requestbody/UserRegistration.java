package com.incedo.kirke.rag.ragapp.requestbody;

public class UserRegistration {
	
	private String email;
	private String password;
	private String confirmPassword;
	
	private String lastName;
	private String firstName;
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public UserRegistration(String email, String password, String confirmPassword, String lastName, String firstName) {
		super();
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.lastName = lastName;
		this.firstName = firstName;
	}
	public UserRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	
	

}
