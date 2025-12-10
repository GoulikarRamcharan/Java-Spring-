package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Employee;

public interface EmpService {

	
	List<Employee> getall();
	
	public Optional<Employee> findbyid(Integer id);
	
	public Employee save(Employee employee);
	
	public Employee update(Employee employee);
	
	public List<Employee> fetchemps(String department);
	
	public List<Employee> fetchsal(double amount);
	public void deleteemp(Integer id);
}
