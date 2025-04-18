package com.example.Practise.repository;
import com.example.Practise.entity.CustomerContactInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerContactInformationRepository extends JpaRepository<CustomerContactInformation,Long> {

}
