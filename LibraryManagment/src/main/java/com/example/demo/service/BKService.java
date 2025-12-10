package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.LibraryBook;

public interface BKService {

	
	public List<LibraryBook> getall();
	
	public Optional<LibraryBook> getby(Integer id);
	
	public LibraryBook savebook(LibraryBook lib);
	
	public LibraryBook updatebook(LibraryBook lib);
	
	public List<LibraryBook> fetchbook(String author);
	
	public List<LibraryBook> fetchyear(Integer year);
	
	public void deleteboo(Integer id);
}
