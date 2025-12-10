package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Posts;
import com.example.demo.repo.Postrepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PostServiceimpl implements PostService{

	@Autowired
	private Postrepo postrepo;
	
	
	@Override
	public List<Posts> getallpost() {
		// TODO Auto-generated method stub
		return postrepo.findAll();
	}

	@Override
	public Optional<Posts> getbypid(Integer id) {
		// TODO Auto-generated method stub
		return postrepo.findById(id);
	}

	@Override
	public Posts savepost(Posts post) {
		// TODO Auto-generated method stub
		return postrepo.save(post);
	}

}
