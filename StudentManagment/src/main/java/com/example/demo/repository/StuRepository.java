package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

@Repository
public interface StuRepository extends JpaRepository<Student, Integer> {
	
	List<Student> findByscourse(String course);
	
	List<Student> findBysnameContaining(String stname);
}
