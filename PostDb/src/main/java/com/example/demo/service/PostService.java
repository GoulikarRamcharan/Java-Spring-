package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Entity.Posts;

public interface PostService {

	public List<Posts> getallpost();
	
	public Optional<Posts> getbypid(Integer id);
	
	public Posts savepost(Posts post);
}
