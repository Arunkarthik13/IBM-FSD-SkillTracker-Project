package com.example.demo;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "employee-service")
public interface EmployeeInterface {

 @PostMapping(value = "/employee/create")
 public ResponseEntity<EmployeeDto> createUser(@RequestBody EmployeeDto eDto);
 
 @GetMapping(value="/employee/get")
 public List<ResponseEntity<EmployeeDto>> getAllEmployees();
 
 @GetMapping(value="/employee/id/{id}")
 public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") int id);
 
 @GetMapping(value="/employee/mobile/{mobile}")
 public ResponseEntity<EmployeeDto> getEmployeeBymobile(@PathVariable("mobile") String mobile);
 
 @GetMapping(value="/employee/email/{email}")
 public ResponseEntity<EmployeeDto> getEmployeeByEmail(@PathVariable("email") String email);
 
 @GetMapping(value="/employee/name/{name}")
 public List<ResponseEntity<EmployeeDto>> getEmployeeByName(@PathVariable("name") String name);
 
 @GetMapping(value="/employee/skills/{skills}")
 public List<ResponseEntity<EmployeeDto>> getEmployeeBySkills(@PathVariable("skills") String skills);
 
 @GetMapping(value="/products/delete/{id}")
 public boolean deleteById(@PathVariable("id") int id);
 
}
