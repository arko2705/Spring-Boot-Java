package com.example.Practise.controller;
import com.example.Practise.entity.CustomerDetail;
import com.example.Practise.service.CustomerService; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.*; 
import java.util.List; 
@RestController 
@RequestMapping("/api/details") 
public class CustomerDetailController { 
@Autowired 
private CustomerService customerService; 
@GetMapping 
public List<CustomerDetail> getAllUsers() { 
return customerService.getAllUsers(); 
} 
@PostMapping 
public CustomerDetail createUser(@RequestBody CustomerDetail customerDetail) { 
return customerService.saveUser(customerDetail); 
} 
} 