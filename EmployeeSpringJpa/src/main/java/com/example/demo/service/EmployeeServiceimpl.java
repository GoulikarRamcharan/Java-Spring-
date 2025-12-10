package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepositry;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeServiceimpl implements EmployeeService{

	@Autowired
	private EmployeeRepositry employeerepo;
	
	
	@Override
	public List<Employee> findall() {
		// TODO Auto-generated method stub
		return employeerepo.findAll();
	}

	@Override
	public Optional<Employee> findbyId(Integer id) {
		// TODO Auto-generated method stub
		return employeerepo.findById(id);
	}

	@Override
	public Employee saveemp(Employee employee) {
		// TODO Auto-generated method stub
		return employeerepo.save(employee);
	}

	@Override
	public void deleteemp(Integer id) {
		// TODO Auto-generated method stub
		employeerepo.deleteById(id);
		
	}

	
}
