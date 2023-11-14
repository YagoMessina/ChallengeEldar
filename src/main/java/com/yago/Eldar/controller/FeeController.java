package com.yago.Eldar.controller;

import com.yago.Eldar.model.CardBrand;
import com.yago.Eldar.service.FeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/fee")
public class FeeController {

    @Autowired
    private FeeService feeService;

    @GetMapping
    public ResponseEntity<BigDecimal> getFee(@RequestParam CardBrand cardBrand, @RequestParam BigDecimal amount) {
        return ResponseEntity.ok(feeService.getFee(cardBrand, amount));
    }
}
