package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Student;

public interface StuService {
	
	public List<Student> getall();
	
	public Optional<Student> findbyid(Integer id);
	
	public Student savestu(Student student);
	
	public Student updatestu(Student student);
	
	public List<Student> getcr(String course);
	
	public List<Student> getnm(String name);
	
	public void deletestu(Integer id);

}
