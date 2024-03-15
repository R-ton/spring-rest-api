package com.spring.springrestapi.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(value = "product")
@AllArgsConstructor
// @NoArgsConstructor
@Builder
@Data
public class Product 
{
    @Id
    private String id;
    private String name;
    private String description;
    private BigInteger price;

    // public static Product[] getAll(){

    //     return null;
    // }
}