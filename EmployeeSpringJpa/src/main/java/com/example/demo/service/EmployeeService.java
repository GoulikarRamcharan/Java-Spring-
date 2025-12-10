package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Employee;

public interface EmployeeService {

	
	List<Employee> findall();
	
	public Optional<Employee> findbyId(Integer id);
	
	public Employee saveemp(Employee employee);

	public void deleteemp(Integer id);
}
