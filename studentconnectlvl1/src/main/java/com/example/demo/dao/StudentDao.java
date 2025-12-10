package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentDao {

	public void save(Student student);
	
	public Student findbyId(Integer id);
	
	public List<Student> findAll();
	
	public void updatestudent(Student student);
	
	public void Deletestudent(Integer id);
	
	
}
