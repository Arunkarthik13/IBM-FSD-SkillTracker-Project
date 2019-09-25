package com.example.demo.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id; 
	@Column(name="name")
	private String name;
	@Column(name="mobile")
	private String mobileNumber;
	@Column(name="email")
	private String email;
	
	@OneToMany(targetEntity=Skills.class,cascade= CascadeType.ALL)
	 List<Skills> skills;
	
	
	public Employee() {
		super();
		skills=new ArrayList<>();
	}
	public Employee(String name, String mobileNumber, String email) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
		
	}
	
	public Employee(String name, String mobileNumber, String email, List<Skills> skills) {
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
	public List<Skills> getSkills() {
		return skills;
	}
	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", email=" + email
				+ ", skills=" + skills + "]";
	}
	
	
	
}
