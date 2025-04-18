package com.example.Practise.service;
import com.example.Practise.entity.CustomerProofOfIdentity;
import com.example.Practise.repository.CustomerProofOfIdentityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CustomerProofOfIdentityService{
	@Autowired
	private CustomerProofOfIdentityRepository customerProofOfIdentityRepository;
	public List<CustomerProofOfIdentity> getUsers(){        //we return an object of type CustomerProofOfIdentity,sm we made ourselves earlier.We made it so that it matches our database
		return customerProofOfIdentityRepository.findAll(); //This is gonna fetch the vcalues for us,customerRepo object
	}
	public CustomerProofOfIdentity saveUsers(CustomerProofOfIdentity customerProofOfIdentity) {
		return customerProofOfIdentityRepository.save(customerProofOfIdentity);
	}
}