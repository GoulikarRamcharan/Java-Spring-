package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StuRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class Stuserviceimpl implements StuService{

	@Autowired
	private StuRepository sturepo;
	
	
	@Override
	public List<Student> getall() {
		// TODO Auto-generated method stub
		return sturepo.findAll();
	}

	@Override
	public Optional<Student> findbyid(Integer id) {
		// TODO Auto-generated method stub
		return sturepo.findById(id);
	}

	@Override
	public Student savestu(Student student) {
		// TODO Auto-generated method stub
		return sturepo.save(student);
	}

	@Override
	public Student updatestu(Student student) {
		// TODO Auto-generated method stub
		return sturepo.save(student);
	}

	@Override
	public List<Student> getcr(String course) {
		// TODO Auto-generated method stub
		return sturepo.findByscourse(course);
	}

	@Override
	public List<Student> getnm(String name) {
		// TODO Auto-generated method stub
		return sturepo.findBysnameContaining(name);
	}

	@Override
	public void deletestu(Integer id) {
		// TODO Auto-generated method stub
		sturepo.deleteById(id);
		
	}

	
}
