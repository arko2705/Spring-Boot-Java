package com.example.Practise.controller;
import com.example.Practise.entity.CustomerIdentification;
import com.example.Practise.service.CustomerIdentificationService;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.*; 
import java.util.List; 

@RestController
@RequestMapping("/api/Identification")
public class CustomerIdentificationController{
	@Autowired 
	private CustomerIdentificationService customerIdentificationService; 
	@GetMapping 
	public List<CustomerIdentification> getAllUsers() { 
	return customerIdentificationService.getAllUsers(); 
	} 
	@PostMapping 
	public CustomerIdentification createUser(@RequestBody CustomerIdentification customerIdentification) { 
	return customerIdentificationService.saveUser(customerIdentification); 
	} 
}