package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.LibraryBook;

@Repository
public interface BKRepo extends JpaRepository<LibraryBook, Integer> {
	
	List<LibraryBook> findByBauth(String author);
	
	List<LibraryBook> findByByear(Integer year);
}
