package com.example.gccoffee.model;

import java.util.UUID;
import lombok.Getter;

@Getter
public class OrderItem {
    UUID productId;
    Category category;
    long price;
    int quantity;
}
