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
@Table(name="noti")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notifications {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="no_id")
	private Integer nid;
	
	@Column(name="no_desc")
	private String ndesc;
	
	
}
