package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Merchant;

public interface MerchantRepository extends JpaRepository<Merchant, Long>{
    
    
}

