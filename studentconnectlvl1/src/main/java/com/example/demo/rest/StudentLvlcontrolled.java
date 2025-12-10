package com.example.demo.rest;

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

public class StudentLvlcontrolled {

	@Autowired
	private StudentDao studentdao;
	
	
	@GetMapping("/students/{id}")
	public Student getstudentbyid(@PathVariable Integer id) {
		
		return 	studentdao.findbyId(id);
	}
	
	@GetMapping("/students")
	
	public List<Student> getAll(){
		return studentdao.findAll();
	}
	
	@PostMapping("/students")
	
	public String savestudent(@RequestBody Student stud) {
		studentdao.save(stud);
		return "Saved Student Successfully";
	}
	
	@PutMapping("/students")
	public String update(@RequestBody Student stud) {
		
		studentdao.updatestudent(stud);
		
		return "Updated Student Successfully";
	}
	
	@DeleteMapping("/students/{id}")
	public String delete(@PathVariable Integer id) {
		studentdao.Deletestudent(id);
		return "Deleted student successfully";
	}
}
