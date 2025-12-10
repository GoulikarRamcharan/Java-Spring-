package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="logusers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usercr {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private Integer uid;
	
	@Column(name="user_name")
	private String uname;
	
	@Transient
	private Posts post;
	
	@Transient
	private Notifications notify;
	
	
}
