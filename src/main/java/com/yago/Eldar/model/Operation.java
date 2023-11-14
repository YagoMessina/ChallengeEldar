package com.yago.Eldar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
public class Operation {

    private BigDecimal amount;
    private Card card;

}
