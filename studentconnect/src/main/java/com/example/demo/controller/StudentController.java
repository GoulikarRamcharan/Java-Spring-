package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;

@RestController
public class StudentController {

	@Autowired
	private StudentDao studentdao;
	
	@GetMapping("/students/{id}")
	public Student getstudentbyid(@PathVariable Integer id) {
		
		return studentdao.findby(id);
	}
	
	@GetMapping("/students")
	public List<Student> getstudents(){
		
		return studentdao.findAll();
	}
	
	@PostMapping("/students")
	public String saveStudent(@RequestBody Student stud) {
		studentdao.save(stud);
		return "Student Saved Successfully";
	}
	
	@PutMapping("/students")
	public String UpdateStudent(@RequestBody Student stud) {
		studentdao.update(stud);
		return "Student Updated Successfully";
	}
	
	@DeleteMapping("/students/{id}")
	
	public String DeleteStudent(@PathVariable Integer id) {
		studentdao.delete(id);
		return "Deleted Student Successfully";
	}
	
	
}
