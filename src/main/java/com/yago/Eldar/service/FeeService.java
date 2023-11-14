package com.yago.Eldar.service;

import com.yago.Eldar.model.CardBrand;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class FeeService {

    public BigDecimal getFee(CardBrand cardBrand, BigDecimal amount) {
        BigDecimal fee = BigDecimal.valueOf(cardBrand.calculateFee());
        return amount.multiply(fee).divide(BigDecimal.valueOf(100), RoundingMode.HALF_UP);
    }
}
