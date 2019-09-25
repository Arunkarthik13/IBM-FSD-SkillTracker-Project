package com.example.demo.bootstrap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.Entity.Employee;
import com.example.demo.Entity.Skills;
import com.example.demo.Entity.SubSkill;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.SkillRepository;
import com.example.demo.repository.SubSkillRepository;

@Component
public class BootStrap  implements ApplicationListener<ContextRefreshedEvent>{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private SkillRepository skillRepository;
	
	@Autowired
	private SubSkillRepository subSkillRepository;

	public BootStrap() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BootStrap(EmployeeRepository employeeRepository,SkillRepository skillRepository, SubSkillRepository subSkillRepository) {
		super();
		this.employeeRepository = employeeRepository;
		this.skillRepository=skillRepository;
		this.subSkillRepository=subSkillRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
//		Set<SubSkill> subSkill= new HashSet<SubSkill>();
//		SubSkill s1=new SubSkill("Spring,Hibernate");
//		subSkill.add(s1);
		ArrayList<String> l3 = new ArrayList<String>(); 
		l3.add("MicroServices");
		l3.add("Spring");
		SubSkill sub=new SubSkill(l3.toString());
		subSkillRepository.save(sub);
		
		ArrayList<String> l5 = new ArrayList<String>(); 
		l5.add("AI");
		SubSkill sub3=new SubSkill(l5.toString());
		subSkillRepository.save(sub3);
	
		Employee e1=new Employee("Priya","9998881155","pri@gmail.com");
		
       employeeRepository.save(e1);
		Skills s=new Skills("Java",e1,sub);
		skillRepository.save(s);
		
		
	
//		Skills skills2=new Skills("Python",e1,sub3);
	
		
		//skillRepository.save(skills);
		
//		Skill skills=new Skill("Java",e1,sub);
//		Skill skills2=new Skill("Python",e1,sub3);
//		skillRepository.save(skills);
//		skillRepository.save(skills2);
//		
//		Set<Skill> s2 = new HashSet<Skill>();
//		s2.add(skills);
		
	}

	

}
