package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Posts;
import com.example.demo.service.PostService;

@RestController
@RequestMapping("/po")
public class PostController {

	@Autowired
	private PostService postservice;
	
	@GetMapping("/posts")
	public List<Posts> findposts(){
		
		return postservice.getallpost();
	}
	
	@GetMapping("/posts/{pid}")
	public Optional<Posts> findbypost(@PathVariable("pid") int id){
		
		return postservice.getbypid(id);
	}
	
	@PostMapping("/posts")
	public Posts savepostn(@RequestBody Posts post) {
		
		return postservice.savepost(post);
	}
}
