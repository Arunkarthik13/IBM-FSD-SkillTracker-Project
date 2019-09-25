package com.example.demo;

public class EmployeeDto {

	private int id;
	private String name;
	private String mobileNumber;
	private String email;
	private String skills;
	public EmployeeDto() {
		super();
	}
	public EmployeeDto(String name, String mobileNumber, String email, String skills) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.skills = skills;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	
	
}
