package com.corerecharge.corerecharge.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentRequest {
    private String profileId;  // IMO Profile ID
    private Double amount;     // Kitna recharge karna hai (rupees me)
    private Integer diamonds;  // Kitne diamonds credit karne hain
}