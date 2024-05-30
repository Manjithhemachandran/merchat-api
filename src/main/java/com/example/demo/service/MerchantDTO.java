package com.example.demo.service;


import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MerchantDTO {
    @NotBlank
    private String userName;
    
    @NotBlank
    private String shopName;
    
    @NotBlank
    private String phoneNumber;
    
    @NotBlank
    private String categoryName; 
}

