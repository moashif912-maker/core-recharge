package com.corerecharge.corerecharge.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PaymentResponse {
    private String orderId;    // Razorpay ya Payment Gateway ka order ID
    private Double amount;     // Kitna amount pay hoga
    private String currency;   // "INR"
    private String status;     // "created"
}