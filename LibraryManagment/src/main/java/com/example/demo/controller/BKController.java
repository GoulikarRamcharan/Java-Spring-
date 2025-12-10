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

import com.example.demo.entity.LibraryBook;
import com.example.demo.service.BKService;

@RestController
@RequestMapping("/library")
public class BKController {

	@Autowired
	private BKService bookservice;
	
	
	@GetMapping("/books")
	public List<LibraryBook> getall(){
		
		return bookservice.getall();
	}
	
	@GetMapping("/books/{id}") 
	public Optional<LibraryBook> gebyid(@PathVariable Integer id){
		
		Optional<LibraryBook> getbk = bookservice.getby(id);
		
		return getbk;
	}
	@GetMapping("/books/author/{name}")
	public List<LibraryBook> fetchbk(@PathVariable String name){
		
		return bookservice.fetchbook(name);
	}
	
	@GetMapping("/books/year/{year}")
	public List<LibraryBook> fetchyr(@PathVariable Integer year){
		
		return bookservice.fetchyear(year);
	}
	
	@PostMapping("/books")
	public LibraryBook savebk(@RequestBody LibraryBook bok) {
		
		return bookservice.savebook(bok);
	}
	
	@PutMapping("/books")
	public LibraryBook updatebk(@RequestBody LibraryBook bks) {
		
		return bookservice.updatebook(bks);
	}
	
	@DeleteMapping("/books/{id}")
	public String Deletebk(@PathVariable Integer id) {
		
		Optional<LibraryBook> getbk = bookservice.getby(id);
		
		if (getbk==null) {
			return "Error";
		}
		bookservice.deleteboo(id);
		
		return "Deleted Successfully";
		
		
	}
}
