package com.example.Practise.repository;
import com.example.Practise.entity.CustomerIdentification;
 
import org.springframework.data.jpa.repository.JpaRepository;
public interface CustomerIdentificationRepository extends JpaRepository<CustomerIdentification,Long> {

}
