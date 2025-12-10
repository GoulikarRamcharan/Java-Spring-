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
@Table(name="emp")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private Integer eid;
	
	@Column(name="name")
	private String ename;
	
	@Column(name="dept")
	private String edept;
	
	@Column(name="desg")
	private String edesg;
	
	@Column(name="salary")
	private double basicpay;
	
	@Column(name="joindate")
	private LocalDate ejoindate;
	
}
