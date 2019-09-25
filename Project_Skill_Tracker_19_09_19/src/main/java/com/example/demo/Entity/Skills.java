//package com.example.demo.Entity;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import org.hibernate.annotations.OnDelete;
//import org.hibernate.annotations.OnDeleteAction;
//
//@Entity
//@Table(name="Skills")
//public class Skills {
//	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="skill_id")
//	private int skill_id; 
//	@Column(name="skill_name")
//	private String skill_name;
//	
//	@ManyToOne
//	@JoinColumn(name="id")
//	private Employee employee;
//
//	@OneToOne
//	private SubSkill subskill;
//  
//	
//	public Skills() {
//		super();
//	}
//	
//	
//	public Skills(String skill_name) {
//		super();
//		this.skill_name = skill_name;
//	}
//
//
//	public Skills(String skill_name, SubSkill subskill) {
//		super();
//		this.skill_name = skill_name;
//		this.subskill = subskill;
//	}
//
//
//	public Skills(String skill_name, Employee employee, SubSkill subskill) {
//		super();
//		this.skill_name = skill_name;
//		this.employee = employee;
//		this.subskill = subskill;
//	}
//
//
//	public int getSkill_id() {
//		return skill_id;
//	}
//
//
//	public void setSkill_id(int skill_id) {
//		this.skill_id = skill_id;
//	}
//
//
//	public String getSkill_name() {
//		return skill_name;
//	}
//
//
//	public void setSkill_name(String skill_name) {
//		this.skill_name = skill_name;
//	}
//
//
//	public Employee getEmployee() {
//		return employee;
//	}
//
//
//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}
//
//
//	public SubSkill getSubskill() {
//		return subskill;
//	}
//
//
//	public void setSubskill(SubSkill subskill) {
//		this.subskill = subskill;
//	}
//	
//	
//
//}
package com.example.demo.Entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Skills {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int skillId;
	private String skillName;
	
	@ManyToOne
	@JoinColumn(name="id")
	private Employee employee;
	
	@OneToOne
	private SubSkill subSkill;
	
	
	public Skills() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Skills(String skillName) {
		super();
		this.skillName = skillName;
	}
	public Skills(String skillName, Employee employee, SubSkill subskill) {
		super();
		this.skillName = skillName;
		this.employee = employee;
		this.subSkill = subskill;
	}
	public int getSkillId() {
		return skillId;
	}
	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	
	

	public Skills(String skillName, SubSkill subskill) {
		super();
		this.skillName = skillName;
		this.subSkill = subskill;
	}
	
}
