package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentDao {

	public void save(Student student);
	
	public Student findby(Integer id);
	
	public List<Student> findAll();
	
	public void update(Student student);
	
	public void delete(Integer id);
	
}
