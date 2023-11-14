package com.yago.Eldar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class Card {

    private CardBrand brand;
    private long number;
    private CardHolder cardHolder;
    private LocalDateTime dueDate;

    public boolean isExpired() {
        return dueDate.isBefore(LocalDateTime.now());
    }

    @Override
    public String toString() {
        return "Card{" +
                "brand=" + brand +
                ", number=" + number +
                ", cardHolder=" + cardHolder +
                ", dueDate=" + dueDate +
                '}';
    }
}
