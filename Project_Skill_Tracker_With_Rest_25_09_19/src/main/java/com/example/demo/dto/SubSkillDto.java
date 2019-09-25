package com.example.demo.dto;

public class SubSkillDto {
	private int Subskill_id;
	private String Subskill_name;
	public SubSkillDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SubSkillDto(String subskill_name) {
		super();
		Subskill_name = subskill_name;
	}
	public int getSubskill_id() {
		return Subskill_id;
	}
	public void setSubskill_id(int subskill_id) {
		Subskill_id = subskill_id;
	}
	public String getSubskill_name() {
		return Subskill_name;
	}
	public void setSubskill_name(String subskill_name) {
		Subskill_name = subskill_name;
	}
	
	
}
