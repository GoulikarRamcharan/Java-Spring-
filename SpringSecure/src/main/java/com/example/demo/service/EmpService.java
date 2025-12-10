package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmpRepository;

@Service
public class EmpService {

	@Autowired
	private EmpRepository emprepo;
	
	public List FindallEmployee() {
		
		return emprepo.findAll();
	}
	
	public Optional findempbuid(Integer id)
	{
		return emprepo.findById(id);
		
	}
	public Employee createEmployee(Employee emp) {
		
		return emprepo.save(emp);
		
	}
	public String deleteemp(Integer id) {
		emprepo.deleteById(id);
		return "Deleted";
	}
}

