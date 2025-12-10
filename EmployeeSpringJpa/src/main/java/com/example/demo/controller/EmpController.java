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
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmpController {

	@Autowired
	private EmployeeService employeeservice;
	
	@GetMapping("/employees")
	public List<Employee> getemps(){
		
		return employeeservice.findall();
		
	}
	
	@GetMapping("/employees/{id}")
	public Optional<Employee> getempbyid(@PathVariable Integer id) {
		 Optional<Employee> getemp = Optional.empty(); 
		try {
		getemp = employeeservice.findbyId(id);
			
		}catch (Exception e) {
			System.out.println("Error"+e);
		}
		return getemp;
	}
	
	@PostMapping("/employees")
	public Employee saveemp(@RequestBody Employee emplooyee) {
		
		Employee dbEmployee = employeeservice.saveemp(emplooyee);
		
		return dbEmployee;
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		Employee dbEmployee = employeeservice.saveemp(employee);
		return dbEmployee;
	}
	
	@DeleteMapping("/employees/{employeeid}")
	public String deleteemployee(@PathVariable Integer employeeid) {
		Optional<Employee> tempEmployee = employeeservice.findbyId(employeeid);
		
		employeeservice.deleteemp(employeeid);
		
		return "deleted successfully";
	}
	
}
