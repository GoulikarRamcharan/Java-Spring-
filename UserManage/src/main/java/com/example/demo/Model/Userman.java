package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Userman {

	private int uid;
	
	private String uname;
	
	private Postu post;
	
	private Notification notification;

	public Userman(int uid, String uname) {
		super();
		this.uid = uid;
		this.uname = uname;
	}

	
	
}
