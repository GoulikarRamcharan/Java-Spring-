package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Notifications;



public interface NotificationService {

public List<Notifications> getallnoti();
	
	public Optional<Notifications> getbynid(Integer id);
	
	public Notifications savenoti(Notifications noti);
}
