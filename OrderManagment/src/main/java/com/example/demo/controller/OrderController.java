package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Orders;
import com.example.demo.service.OService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OService oser;
	
	@GetMapping("/orders")
	public List<Orders> findallor(){
		
		return oser.getallor();
		
	}
	
	@GetMapping("/orders/{id}")
	public Optional<Orders> findorderbyi(@PathVariable Integer id){
		
		return oser.getbyoid(id);
	}
	
	@GetMapping("/orders/name/{cname}")
	public List<Orders> findbycname(@PathVariable String cname){
		
		return oser.getbynm(cname);
		
	}
	
	@PostMapping("/orders")
	public Orders saveor(@RequestBody Orders order) {
		
		return oser.saveorder(order);
	}
	
	@PutMapping("/orders")
	public Orders updateor(@RequestBody Orders order) {
		
		return oser.updateorder(order);
	}
	
	@DeleteMapping("/orders/{id}")
	public String Deleteor(@PathVariable Integer id) {
		
		oser.deleteorders(id);
		
		return "Deleted Successfully";
		
	}
}
