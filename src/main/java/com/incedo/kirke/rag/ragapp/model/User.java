package com.incedo.kirke.rag.ragapp.model;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Date lastPromotedOn;
	private String program;
	private String currentLevel;

	private Long manager_id;

	private Date doj;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	public User(Long id, String firstName, String lastName, String email, String password, Date lastPromotedOn,
			String program, String currentLevel, Long manager_id, Date doj) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.lastPromotedOn = lastPromotedOn;
		this.program = program;
		this.currentLevel = currentLevel;
		this.manager_id = manager_id;
		this.doj = doj;
	}




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public Long getManager_id() {
		return manager_id;
	}

	public void setManager_id(Long manager_id) {
		this.manager_id = manager_id;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public Date getLastPromotedOn() {
		return lastPromotedOn;
	}

	public void setLastPromotedOn(Date lastPromotedOn) {
		this.lastPromotedOn = lastPromotedOn;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public String getCurrentLevel() {
		return currentLevel;
	}

	public void setCurrentLevel(String currentLevel) {
		this.currentLevel = currentLevel;
	}



}