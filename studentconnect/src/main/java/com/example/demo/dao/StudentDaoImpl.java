package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	
	private EntityManager entitymanager;
	
	
	@Override
	@Transactional
	public void save(Student student) {
		entitymanager.persist(student);
		
	}

	@Override
	public Student findby(Integer sid) {
		return entitymanager.find(Student.class, sid);
	}

	@Override
	public List<Student> findAll() {
		TypedQuery<Student> query = entitymanager.createQuery("From Student",Student.class);
		
		List<Student> studs =query.getResultList();
		return studs;
	}

	@Override
	@Transactional
	public void update(Student student) {
		entitymanager.merge(student);
		
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		Student student = entitymanager.find(Student.class, id);
		
		entitymanager.remove(student);
		
	}

}
