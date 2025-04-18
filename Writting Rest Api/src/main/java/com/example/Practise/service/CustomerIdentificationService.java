package com.example.Practise.service;
import com.example.Practise.entity.CustomerIdentification;
import com.example.Practise.repository.CustomerIdentificationRepository;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;
import java.util.List;
@Service 
public class CustomerIdentificationService { 
@Autowired 
private CustomerIdentificationRepository customerIdentificationRepository; 
public List<CustomerIdentification> getAllUsers() { 
return customerIdentificationRepository.findAll(); 
} 
public CustomerIdentification saveUser(CustomerIdentification customerIdentification) { 
return customerIdentificationRepository.save(customerIdentification); 
} 
} 