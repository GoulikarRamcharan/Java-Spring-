package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Postu;

@RestController
@RequestMapping("/posts")
public class PostController {

	@GetMapping("/hello/{id}")
	public Postu hello(@PathVariable("id") int pid) {
		
		Postu post = new Postu(pid,"New Post Related to Insta with ID : "+pid);
		
		return post;
	}
}
