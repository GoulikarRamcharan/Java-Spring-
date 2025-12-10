package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;


@Repository
public class StudentDaoimpl implements StudentDao{

	@Autowired
	private EntityManager entitymanager;
	
	
	@Override
	@Transactional
	public void save(Student student) {
		entitymanager.persist(student);
		
	}

	@Override
	public Student findbyId(Integer sid) {
		
		return entitymanager.find(Student.class, sid);
	}

	@Override
	
	public List<Student> findAll() {
		TypedQuery<Student> query = entitymanager.createQuery("From Student",Student.class);
		List<Student> stud = query.getResultList();
		return stud;
	}

	@Override
	@Transactional
	public void updatestudent(Student student) {
		entitymanager.merge(student);
	}

	@Override
	@Transactional
	public void Deletestudent(Integer id) {
		 Student student = entitymanager.find(Student.class, id);
		 entitymanager.remove(student);
		
	}

}
