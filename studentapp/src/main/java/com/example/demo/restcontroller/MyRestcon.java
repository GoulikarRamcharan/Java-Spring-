package com.example.demo.restcontroller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.student.Student;

@RestController
@RequestMapping("/api")
public class MyRestcon {
	
	
	public List<Student> liststudent(){
		
		List<Student> slist=new ArrayList<>();
		
		slist.add(new Student(101,"Alice",9.1));
		slist.add(new Student(102,"Bob",8.5));
		slist.add(new Student(103,"Charlie",9.3));
		slist.add(new Student(104,"Bob",8.5));
		
		return slist;
	
		}
	
		@GetMapping("/students")
		
		public List<Student> getstudent(){
		
			List<Student> stud = liststudent();
			return stud;
		}
		
		@GetMapping("/students/{sid}")
		
		public Student findstud(@PathVariable int sid) {
			
			List<Student> stud = liststudent();
			return stud.get(sid);
		}
		
		@PostMapping("/students")
		
		public Student addstudent(@RequestBody Student stud) {
			
			return stud;
		}
		
	}
