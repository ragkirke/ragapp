package com.incedo.kirke.rag.ragapp.model;

import java.sql.Date;

public class RagEntry {

	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private Date lastPromotedOn;
	private String program;
	private String currentLevel;

	private Long manager_id;

	private Date doj;
	
	private int rag;
	private String ragNotes;
	private Date etaDate;
	private String managerName;
	private int month;
	private int year;
	
	
	public RagEntry() {
		super();
		// TODO Auto-generated constructor stub
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
	public int getRag() {
		return rag;
	}
	public void setRag(int rag) {
		this.rag = rag;
	}
	public String getRagNotes() {
		return ragNotes;
	}
	public void setRagNotes(String ragNotes) {
		this.ragNotes = ragNotes;
	}
	public Date getEtaDate() {
		return etaDate;
	}
	public void setEtaDate(Date etaDate) {
		this.etaDate = etaDate;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "RagEntry [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", lastPromotedOn=" + lastPromotedOn + ", program=" + program + ", currentLevel=" + currentLevel
				+ ", manager_id=" + manager_id + ", doj=" + doj + ", rag=" + rag + ", ragNotes=" + ragNotes
				+ ", etaDate=" + etaDate + ", managerName=" + managerName + ", month=" + month + ", year=" + year + "]";
	}
	
	
	
	
	
	
	
}
