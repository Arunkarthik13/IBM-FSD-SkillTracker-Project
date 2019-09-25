package com.example.demo.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class SubSkill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String subSkill;
	
	
	
	
	public SubSkill() {
		super();
		// TODO Auto-generated constructor stub
	}


	public SubSkill(String subSkill) {
		super();
		this.subSkill = subSkill;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getSubSkill() {
		return subSkill;
	}


	public void setSubSkill(String subSkill) {
		this.subSkill = subSkill;
	}
	

}