package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.LibraryBook;
import com.example.demo.repository.BKRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class BKServiceimpl implements BKService {
	
	@Autowired
	private BKRepo bookrepo;
	

	@Override
	public List<LibraryBook> getall() {
		// TODO Auto-generated method stub
		return bookrepo.findAll();
	}

	@Override
	public Optional<LibraryBook> getby(Integer id) {
		// TODO Auto-generated method stub
		return bookrepo.findById(id);
	}

	@Override
	public LibraryBook savebook(LibraryBook lib) {
		// TODO Auto-generated method stub
		return bookrepo.save(lib);
	}

	@Override
	public LibraryBook updatebook(LibraryBook lib) {
		// TODO Auto-generated method stub
		return bookrepo.save(lib);
	}

	@Override
	public List<LibraryBook> fetchbook(String author) {
		// TODO Auto-generated method stub
		return bookrepo.findByBauth(author);
	}

	@Override
	public List<LibraryBook> fetchyear(Integer year) {
		// TODO Auto-generated method stub
		return bookrepo.findByByear(year);
	}

	@Override
	public void deleteboo(Integer id) {
		// TODO Auto-generated method stub
		bookrepo.deleteById(id);
	}

}
