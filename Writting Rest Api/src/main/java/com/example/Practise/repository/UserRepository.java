package com.example.Practise.repository;
import org.springframework.data.jpa.repository.JpaRepository; 
import com.example.Practise.entity.User; 
public interface UserRepository extends JpaRepository<User, Long> { 
} 
