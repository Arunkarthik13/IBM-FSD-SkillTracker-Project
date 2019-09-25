package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/emp")
public class EmployeeFiegnController {
    
	@Autowired
	private EmployeeInterface employeeInterface;
	
	public EmployeeFiegnController() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeFiegnController(EmployeeInterface employeeInterface) {
		super();
		this.employeeInterface = employeeInterface;
	}
	@GetMapping("/showForm")
	public String createUser(Model theModel)
	{
		EmployeeDto eDto=new EmployeeDto();
		theModel.addAttribute("employee",eDto);
		return "add-employee";
	}
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute ("employee") EmployeeDto eDto)
	{
		employeeInterface.createUser(eDto);
		return "redirect:/emp/list";
	}
	
	@GetMapping("/list")
	public String getAllProducts(Model theModel)
	{
	 List<ResponseEntity<EmployeeDto>> list=employeeInterface.getAllEmployees();
		
	 theModel.addAttribute("addemp", list);
	  return "list-employee";
	}
	
	@GetMapping("/updateForm")
		public String getAllByIdUpdate(Model theModel, @RequestParam("id") int id)
		{
			ResponseEntity<EmployeeDto> edto=employeeInterface.getEmployeeById(id);
			theModel.addAttribute("employee",edto);
			return "add-employee";
		}
	
	@GetMapping("/getid")
	public String getAllById(Model theModel, @RequestParam("id") int id)
	{
		ResponseEntity<EmployeeDto> edto=employeeInterface.getEmployeeById(id);
		theModel.addAttribute("addemp",edto);
		return "list-employee";
	}
	
	@GetMapping("/getmobile")
	public String getAllByMobile(Model theModel, @RequestParam("mobile") String mobile)
	{
		ResponseEntity<EmployeeDto> edto=employeeInterface.getEmployeeBymobile(mobile);
		theModel.addAttribute("addemp",edto);
		return "list-employee";
	}
	
	@GetMapping("/getemail")
	public String getAllByEmail(Model theModel, @RequestParam("email") String email)
	{
		ResponseEntity<EmployeeDto> edto=employeeInterface.getEmployeeByEmail(email);
		theModel.addAttribute("addemp",edto);
		return "list-employee";
	}
	
	@GetMapping("/getname")
	public String getAllByName(Model theModel, @RequestParam("name") String name)
	{
		List<ResponseEntity<EmployeeDto>> edto=employeeInterface.getEmployeeByName(name);
		theModel.addAttribute("addemp",edto);
		return "list-employee";
	}
	
	@GetMapping("/getskills")
	public String getAllBySkills(Model theModel, @RequestParam("name") String skills)
	{
		List<ResponseEntity<EmployeeDto>> edto=employeeInterface.getEmployeeBySkills(skills);
		theModel.addAttribute("addemp",edto);
		return "list-employee";
	}
	
	@GetMapping("/delete")
	public String deleteById(@RequestParam("id") int id)
	{
		employeeInterface.deleteById(id);
		return "redirect:/pro/fetchproducts/";
	}
	
	
	
}
