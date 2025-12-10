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
@Table(name="orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="or_id")
	private Integer oid;
	
	@Column(name="or_name")
	private String ocust;
	
	@Column(name="or_prod")
	private String oprod;
	
	@Column(name="or_qt")
	private Integer oqt;
	
	@Column(name="or_date")
	private LocalDate odate;
	
	@Column(name="or_status")
	private String ostatus;
}
