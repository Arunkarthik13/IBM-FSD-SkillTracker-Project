package com.example.demo.dto;

public class SkillDto {
	
	private int skill_id;
	private String skill_name;
	public SkillDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SkillDto( String skill_name) {
		super();
		
		this.skill_name = skill_name;
	}
	public int getSkill_id() {
		return skill_id;
	}
	public void setSkill_id(int skill_id) {
		this.skill_id = skill_id;
	}
	public String getSkill_name() {
		return skill_name;
	}
	public void setSkill_name(String skill_name) {
		this.skill_name = skill_name;
	}
	
	

}
