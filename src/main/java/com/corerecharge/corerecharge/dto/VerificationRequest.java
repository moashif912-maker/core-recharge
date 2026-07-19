package com.corerecharge.corerecharge.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VerificationRequest {
    private String orderId;
    private String paymentId;
    private String signature;
}