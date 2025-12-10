package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmpService;

@RestController
@RequestMapping("/api")
public class EmpController {

	@Autowired
	private EmpService empservice;
	
	@GetMapping("/employees")
	public List<Employee> findallemps(){
		
		List<Employee> emp = empservice.getall();
		
		return emp;
	}
	
	@GetMapping("/employees/{id}")
	public Optional<Employee> findbyud(@PathVariable Integer id){
		
		Optional<Employee> emps = empservice.findbyid(id);
		
		return emps;
	}
	
	@PostMapping("/employees")
	public Employee saveemp(@RequestBody Employee employee) {
		
		return empservice.save(employee);
	}
	
	@PutMapping("/employees")
	public Employee Updateemp(@RequestBody Employee employee) {
		
		return empservice.update(employee);
	}
	
	@DeleteMapping("/employees/{employeeid}")
	public String deleteemployee(@PathVariable Integer employeeid) {
		Optional<Employee> tempEmployee = empservice.findbyid(employeeid);
		
		empservice.deleteemp(employeeid);
		
		return "deleted successfully";
	}
}
