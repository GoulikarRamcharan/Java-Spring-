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
public class Empcontroller {
	
	@Autowired
	private EmpService empser;
	
	@GetMapping("/emps")
	public List<Employee> getallemp(){
		return empser.FindallEmployee();
	}
	
	@GetMapping("/emps/{employeeId}")
	public Optional<Employee> getEmployee(@PathVariable Integer employeeId) {
		return empser.findempbuid(employeeId);
	}
	
	@PostMapping("/emps")
	public Employee addEmployee(@RequestBody Employee employee) {
		
		return	empser.createEmployee(employee);
	}
	@PutMapping("/emps")
	public Employee updateEmployee(@RequestBody Employee employee) {
		
		return	empser.createEmployee(employee);
	}
	
	@DeleteMapping("/emps/{employeeid}")
	public String deleteemployee(@PathVariable Integer employeeid) {
		Optional<Employee> tempEmployee = empser.findempbuid(employeeid);
		if(tempEmployee == null) {
			throw new RuntimeException("Employee ID not found: "+employeeid);
		}
		else
			empser.deleteemp(employeeid);
	
		return "Employee with ID:"+employeeid+" deleted"; 
		
	}
	
	
}
