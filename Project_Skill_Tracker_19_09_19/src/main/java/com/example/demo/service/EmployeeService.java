package com.example.demo.service;

import java.util.List;

import com.example.demo.Entity.Employee;
import com.example.demo.dto.EmployeeDto;

public interface EmployeeService {

	public EmployeeDto createUser(EmployeeDto eDto);
	
	public List<EmployeeDto> getAllEmployees ();
	
	public EmployeeDto searchById(int id);
	
	public List<EmployeeDto> searchByName(String name);
	
	public EmployeeDto searchByEmail(String email);
	
	public EmployeeDto searchByNumber(String theMobileNumber);
	
	public List<EmployeeDto> searchBySkills(String skills);
	
	public void deleteById(int id);

	public List<String> search(String parameter);
	
}
