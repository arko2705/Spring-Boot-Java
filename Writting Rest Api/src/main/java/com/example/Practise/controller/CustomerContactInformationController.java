package com.example.Practise.controller;
import com.example.Practise.entity.CustomerContactInformation;
import com.example.Practise.service.CustomerContactInformationService;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.*; 
import java.util.List; 

@RestController
@RequestMapping("/api/CustomerContactInformation")
public class CustomerContactInformationController{
	@Autowired 
	private CustomerContactInformationService customerContactInformationService; 
	@GetMapping 
	public List<CustomerContactInformation> getAllUsers() { 
	return customerContactInformationService.getAllUsers(); 
	} 
	@PostMapping 
	public CustomerContactInformation createUser(@RequestBody CustomerContactInformation customerContactInformation){ 
	return customerContactInformationService.saveUser(customerContactInformation); 
	} 
}