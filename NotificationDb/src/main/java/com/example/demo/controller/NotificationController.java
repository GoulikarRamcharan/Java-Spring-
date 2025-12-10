package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Notifications;
import com.example.demo.service.NotificationService;

@RestController
@RequestMapping("/noti")
public class NotificationController {

	@Autowired
	private NotificationService notiservice;
	
	@GetMapping("/notifications")
	public List<Notifications> getallnotif(){
		
		return notiservice.getallnoti();
	}
	
	@GetMapping("/notifications/{nid}")
	public Optional<Notifications> getbynitiid(@PathVariable("nid") int id){
		
		return notiservice.getbynid(id);
	}
	
	@PostMapping("/notifications")
	public Notifications savenotif(@RequestBody Notifications notify) {
		
		return notiservice.savenoti(notify);
	}
	
}
