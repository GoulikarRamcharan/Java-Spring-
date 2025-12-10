package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Usercr;

public interface UserService {

	public List<Usercr> getalluser();
	
	public Optional<Usercr> getuserbyid(Integer id);
	
	public Usercr saveuser(Usercr users);
	
}
