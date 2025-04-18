package com.example.Practise.service; 
import java.util.List; 
import com.example.Practise.entity.CustomerDetail; 
import com.example.Practise.repository.CustomerRepository; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
@Service 
public class CustomerService { 
@Autowired 
private CustomerRepository customerRepository; 
public List<CustomerDetail> getAllUsers() { 
return customerRepository.findAll(); 
} 
public CustomerDetail saveUser(CustomerDetail customerDetail) { 
return customerRepository.save(customerDetail); 
} 
} 