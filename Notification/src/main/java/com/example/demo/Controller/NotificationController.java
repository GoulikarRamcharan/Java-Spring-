package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Notification;

@RestController
@RequestMapping("/")
public class NotificationController {

	@GetMapping("/notification/{id}")
	public Notification getnoti(@PathVariable("id") int noid) {
		
		Notification notify = new Notification(noid,"New Alert!!!!!!! for ID :"+noid);
		
		return notify;
		
	}
}
