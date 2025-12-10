package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StuService;

@RestController
@RequestMapping("/stu")
public class StuController {

	@Autowired
	private StuService stservice;
	
	
	@GetMapping("/students")
	public List<Student> findallstu(){
		
		return stservice.getall();
	}
	
	@GetMapping("/students/{id}")
	public Optional<Student> findbyi(@PathVariable Integer id){
		
		return stservice.findbyid(id);
		
	}
	
	@GetMapping("/students/course/{cname}")
	public List<Student> findbycourse(@PathVariable String cname){
		
		return stservice.getcr(cname);
	}
	@GetMapping("/students/name/{stname}")
	public List<Student> findbynm(@PathVariable String stname){
		
		return stservice.getnm(stname);
	}
	
	
	@PostMapping("/students")
	public Student savest(@RequestBody Student student) {
		
		return stservice.savestu(student);
	}
	
	@PutMapping("/students")
	public Student updatess(@RequestBody Student student) {
		
		return stservice.updatestu(student);
	}
	
	
	@DeleteMapping("/students/{id}")
	public String Deletest(@PathVariable Integer id) {
		
		stservice.deletestu(id);
		
		return "Deleted Student Successfully";
	}
}
