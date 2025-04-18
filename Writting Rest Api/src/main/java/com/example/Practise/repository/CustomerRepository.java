package com.example.Practise.repository;
import com.example.Practise.entity.CustomerDetail;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerDetail,Long> {

}
