package com.example.gccoffee.controller;

import com.example.gccoffee.model.Category;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateProductRequest {
    String productName;
    Category category;
    long price;
    String description;
}
