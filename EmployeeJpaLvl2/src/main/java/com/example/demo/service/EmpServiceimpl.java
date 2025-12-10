package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmpRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmpServiceimpl implements EmpService{
	
	@Autowired
	private EmpRepository emprepo;
	

	@Override
	public List<Employee> getall() {
		// TODO Auto-generated method stub
		return emprepo.findAll();
	}

	@Override
	public Optional<Employee> findbyid(Integer id) {
		Optional<Employee> getemp = emprepo.findById(id);
		return getemp;
	}

	@Override
	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		return emprepo.save(employee);
	}

	@Override
	public void deleteemp(Integer id) {
	emprepo.deleteById(id);
		
	}

	@Override
	public Employee update(Employee employee) {
		Employee emp = emprepo.save(employee);
		return emp;
	}

}
