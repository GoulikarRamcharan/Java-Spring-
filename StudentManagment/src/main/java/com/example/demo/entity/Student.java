package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="stu_id")
	private Integer sid;
	
	@Column(name="stu_name")
	private String sname;
	
	@Column(name="stu_email")
	private String semail;
	
	@Column(name="stu_course")
	private String scourse;
	
	@Column(name="stu_jdate")
	private LocalDate sdate;
	
	
	
}
