package com.corerecharge.corerecharge.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/payment")
@CrossOrigin(origins = "*")
public class PaymentController {

    // Razorpay ka saara logic (imports, variables, methods) hata diya gaya hai.

    @GetMapping("/support-contact")
    public ResponseEntity<?> getSupportContact() {
        // Ye tumhara contact support ka logic hai jo tumne bola tha bachana hai
        return ResponseEntity.ok("+919580897398");
    }

    // Ab yahan koi bhi Razorpay wala POST mapping nahi hai.
    // Frontend se ab direct QR image show hogi, backend call ki zaroorat nahi hai.
}