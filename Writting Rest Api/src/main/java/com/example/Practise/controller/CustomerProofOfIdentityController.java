package com.example.Practise.controller;
import com.example.Practise.service.CustomerProofOfIdentityService;
import com.example.Practise.entity.CustomerProofOfIdentity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/CustomerProofOfIdentity")
public class CustomerProofOfIdentityController{
	@Autowired
	private CustomerProofOfIdentityService customerProofOfIdentityService;
	@GetMapping
	public List<CustomerProofOfIdentity> getUsers(){
		return customerProofOfIdentityService.getUsers();
	}
	@PostMapping 
	public CustomerProofOfIdentity createUser(@RequestBody CustomerProofOfIdentity customerProofOfIdentity) { 
	return customerProofOfIdentityService.saveUsers(customerProofOfIdentity); 
	} 
}
