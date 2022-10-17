package com.cellers.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Product {
    
    private int prdId; 
    private String prdName;

}