package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Admin;
public interface AdminRepository extends JpaRepository<Admin, Long>{
    public Admin findByEmail(String email);
}

