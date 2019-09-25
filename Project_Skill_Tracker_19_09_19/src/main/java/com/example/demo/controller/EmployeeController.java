package com.example.demo.controller;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

import javax.servlet.http.HttpServletRequest;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.dto.RequestModelMapper;
import com.example.demo.dto.ResponseModelMapper;
import com.example.demo.service.EmployeeService;


@Controller
@RequestMapping("/employee")
public class EmployeeController {
     
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/mainpage")
	public String index() 
	{
		return "index";
	}
	@RequestMapping("/search")
	@ResponseBody
	public List<String> search(HttpServletRequest request) {
		return employeeService.search(request.getParameter("term"));
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseModelMapper> createUser(@RequestBody RequestModelMapper empdetail)
	{
		ModelMapper mapper=new ModelMapper();
	     mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		EmployeeDto eDto=mapper.map(empdetail, EmployeeDto.class);
	   EmployeeDto tempDto=employeeService.createUser(eDto);
	   
	ResponseModelMapper model=mapper.map(tempDto,ResponseModelMapper.class);
	return ResponseEntity.status(HttpStatus.CREATED).body(model);		
	}
	@GetMapping("/get")
	public List<ResponseEntity<ResponseModelMapper>> getAllemployee()
	{	
		ModelMapper mapper=new ModelMapper();
		 mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<EmployeeDto> emp=employeeService.getAllEmployees();
		List<ResponseEntity<ResponseModelMapper>> list= new ArrayList<ResponseEntity<ResponseModelMapper>>();
		
	    for(EmployeeDto e:emp) {
	    	ResponseModelMapper res= mapper.map(e,ResponseModelMapper.class);
	    	list.add(ResponseEntity.status(HttpStatus.CREATED).body(res));
	    	
	    }
	    return list;
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<ResponseModelMapper> getAllById(@PathVariable("id") int id)
	{
		ModelMapper mapper=new ModelMapper();
	     mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		EmployeeDto empdto=employeeService.searchById(id);	
		  
		ResponseModelMapper res=mapper.map(empdto, ResponseModelMapper.class);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(res);		
	}
	
	@GetMapping("/email/{email}")
	public ResponseEntity<ResponseModelMapper> getAllByEmail(@PathVariable("email") String email)
	{
		ModelMapper mapper=new ModelMapper();
	     mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		EmployeeDto empdto=employeeService.searchByEmail(email);	
		  
		ResponseModelMapper res=mapper.map(empdto, ResponseModelMapper.class);

		return ResponseEntity.status(HttpStatus.CREATED).body(res);		
	}
	
	@GetMapping("/mobile/{mobile}")
	public ResponseEntity<ResponseModelMapper> getAllByMobile(@PathVariable("mobile") String mobile)
	{
		ModelMapper mapper=new ModelMapper();
	     mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		EmployeeDto empdto=employeeService.searchByNumber(mobile);	
		  
		ResponseModelMapper res=mapper.map(empdto, ResponseModelMapper.class);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(res);		
	}
	
	@GetMapping("/name/{name}")
	public List<ResponseEntity<ResponseModelMapper>> getAllByName(@PathVariable("name") String name)
	{
		ModelMapper mapper=new ModelMapper();
		 mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<EmployeeDto> emp=employeeService.searchByName(name);
		List<ResponseEntity<ResponseModelMapper>> list= new ArrayList<ResponseEntity<ResponseModelMapper>>();
		
	    for(EmployeeDto e:emp) {
	    	ResponseModelMapper res= mapper.map(e,ResponseModelMapper.class);
	    	list.add(ResponseEntity.status(HttpStatus.CREATED).body(res));
	    	
	    }
	    return list;		
	}
	
	@GetMapping("/skills/{skills}")
	public List<ResponseEntity<ResponseModelMapper>> getAllBySkills(@PathVariable("skills") String skills)
	{
		ModelMapper mapper=new ModelMapper();
		 mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<EmployeeDto> emp=employeeService.searchBySkills(skills);
		List<ResponseEntity<ResponseModelMapper>> list= new ArrayList<ResponseEntity<ResponseModelMapper>>();
		
	    for(EmployeeDto e:emp) {
	    	ResponseModelMapper res= mapper.map(e,ResponseModelMapper.class);
	    	list.add(ResponseEntity.status(HttpStatus.CREATED).body(res));
	    	
	    }
	    return list;			
	}
	
	@GetMapping("/delete/{id}")
	public ResponseEntity<?> deleteById(@PathVariable("id") int id)
	{
		employeeService.deleteById(id);
		return ResponseEntity.ok("deleted");
	}
	
	
	
}
