package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Orders;

public interface OService {

	public List<Orders> getallor();
	
	public Optional<Orders> getbyoid(Integer id);
	
	public Orders saveorder(Orders gorder);
	
	public Orders updateorder(Orders gorder);
	
	public List<Orders> getbynm(String sname);
	
	public void deleteorders(Integer Id);
}
