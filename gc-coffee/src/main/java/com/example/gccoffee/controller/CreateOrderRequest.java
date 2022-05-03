package com.example.gccoffee.controller;

import com.example.gccoffee.model.OrderItem;
import java.util.List;
import lombok.Getter;

@Getter
public class CreateOrderRequest {
    String email;
    String address;
    String postcode;
    List<OrderItem> orderItems;
}
