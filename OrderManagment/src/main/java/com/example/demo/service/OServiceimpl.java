package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Orders;
import com.example.demo.repository.ORepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class OServiceimpl implements OService{
	
	@Autowired
	private ORepository orepo;
	

	@Override
	public List<Orders> getallor() {
		// TODO Auto-generated method stub
		return orepo.findAll();
	}

	@Override
	public Optional<Orders> getbyoid(Integer id) {
		// TODO Auto-generated method stub
		return orepo.findById(id);
	}

	@Override
	public Orders saveorder(Orders gorder) {
		// TODO Auto-generated method stub
		return orepo.save(gorder);
	}

	@Override
	public Orders updateorder(Orders gorder) {
		// TODO Auto-generated method stub
		return orepo.save(gorder);
	}

	@Override
	public List<Orders> getbynm(String sname) {
		// TODO Auto-generated method stub
		return orepo.findByocust(sname);
	}

	@Override
	public void deleteorders(Integer Id) {
		// TODO Auto-generated method stub
		orepo.deleteById(Id);
	}

}
