package com.corerecharge.corerecharge.service;

import com.corerecharge.corerecharge.dto.PaymentRequest;
import com.corerecharge.corerecharge.dto.PaymentResponse;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public PaymentResponse createOrder(PaymentRequest request) throws Exception {
        // Database hatane ke baad, ab hum sirf dummy response return karenge.
        // Frontend ko bas ek orderId chahiye, wo yahan se mil jayegi.

        String dummyOrderId = "txn_" + System.currentTimeMillis();

        return new PaymentResponse(
                dummyOrderId,
                request.getAmount(),
                "INR",
                "waiting"
        );
    }
}