package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Model.Notification;
import com.example.demo.Model.Postu;
import com.example.demo.Model.Userman;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/users/{usid}")
	public Userman getuser(@PathVariable("usid") int uid) {
		
		Userman user = new Userman(uid,"Welcome Ram Your ID: "+uid);
		
		
		Postu post = restTemplate.getForObject("http://localhost:9001/posts/hello/1",Postu.class);
		
		Notification notify = restTemplate.getForObject("http://localhost:9002/notification/1",Notification.class);
	
		user.setPost(post);
		user.setNotification(notify);
		
		return user;
	}
}
