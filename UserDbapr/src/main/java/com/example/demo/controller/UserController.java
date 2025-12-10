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
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Notifications;
import com.example.demo.entity.Posts;
import com.example.demo.entity.Usercr;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/ur")
public class UserController {

	@Autowired
	private UserService userser;
	
	@Autowired
	private RestTemplate resttemplate;
	
	@GetMapping("/users")
	public List<Usercr> getalluserdetails() {
		
		List<Usercr> users = userser.getalluser();
		
		for (Usercr user : users) {
			
		
		
		Posts post = resttemplate.getForObject("http://localhost:8010/po/posts/"+user.getUid(), Posts.class);
		
		Notifications notify = resttemplate.getForObject("http://localhost:8011/noti/notifications/"+user.getUid(), Notifications.class);
		
		user.setPost(post);
		user.setNotify(notify);
		}
		return users;
		
	}
	
	@GetMapping("/users/{id}")
	public Usercr getiduserdetails(@PathVariable("id") int usid) {
		
		Optional<Usercr> userget = userser.getuserbyid(usid);
		
		Usercr usget = userget.get();
		
		Posts post = resttemplate.getForObject("http://localhost:8010/po/posts/"+usid, Posts.class);
		
		Notifications notify = resttemplate.getForObject("http://localhost:8011/noti/notifications/"+usid, Notifications.class);
		
		usget.setPost(post);
		usget.setNotify(notify);
		
		return usget;
	}
	
	@PostMapping("/users")
	public Usercr saveuserde(@RequestBody Usercr user) {
		
		return userser.saveuser(user);
	}
	
	
}
