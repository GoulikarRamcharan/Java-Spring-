package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Notifications;
import com.example.demo.repo.Notificationrepo;

import jakarta.transaction.Transactional;

@Service
@Transactional

public class NotificationsServiceimpl implements NotificationService{

	@Autowired
	private Notificationrepo notirepo;
	
	
	@Override
	public List<Notifications> getallnoti() {
		// TODO Auto-generated method stub
		return notirepo.findAll();
	}

	@Override
	public Optional<Notifications> getbynid(Integer id) {
		// TODO Auto-generated method stub
		return notirepo.findById(id);
	}

	@Override
	public Notifications savenoti(Notifications noti) {
		// TODO Auto-generated method stub
		return notirepo.save(noti);
	}

}
