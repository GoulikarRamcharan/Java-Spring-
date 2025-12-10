package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Usercr;
import com.example.demo.repo.Userrepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class Userserviceimpl implements UserService{
	
	@Autowired
	private Userrepo userrepo;

	@Override
	public List<Usercr> getalluser() {
		// TODO Auto-generated method stub
		return userrepo.findAll();
	}

	@Override
	public Optional<Usercr> getuserbyid(Integer id) {
		// TODO Auto-generated method stub
		return userrepo.findById(id);
	}

	@Override
	public Usercr saveuser(Usercr users) {
		// TODO Auto-generated method stub
		return userrepo.save(users);
	}

}
