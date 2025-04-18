package com.example.Practise.service;
import com.example.Practise.entity.CustomerContactInformation;
import com.example.Practise.repository.CustomerContactInformationRepository;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;
import java.util.List;
@Service 
public class CustomerContactInformationService { 
@Autowired 
private CustomerContactInformationRepository customerContactInformationRepository; 
public List<CustomerContactInformation> getAllUsers() { 
return customerContactInformationRepository.findAll(); 
} 
public CustomerContactInformation saveUser(CustomerContactInformation customerContactInformation) { 
return customerContactInformationRepository.save(customerContactInformation); 
} 
} 