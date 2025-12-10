package com.example.demo.entity;

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
@Table(name="books")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LibraryBook {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="book_id")
	private Integer bid;
	
	@Column(name="book_name")
	private String bname;
	
	@Column(name="book_auth")
	private String bauth;
	
	@Column(name="book_price")
	private double bprice;
	
	@Column(name="book_year")
	private Integer byear;
	
}
