package com.corerecharge.corerecharge.service;

import com.corerecharge.corerecharge.dto.PaymentRequest;
import com.corerecharge.corerecharge.dto.PaymentResponse;

public interface PaymentService {
    PaymentResponse createOrder(PaymentRequest request) throws Exception;
}