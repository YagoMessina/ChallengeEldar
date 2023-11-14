package com.yago.Eldar.model;

import java.time.LocalDateTime;

public enum CardBrand {

    VISA {
        @Override
        public double calculateFee() {
            LocalDateTime today = LocalDateTime.now();
            String year = String.valueOf(today.getYear()).substring(2);
            return Double.parseDouble(year) / today.getMonth().getValue();
        }
    },
    NARA {
        @Override
        public double calculateFee() {
            return LocalDateTime.now().getDayOfMonth() * 0.5;
        }
    },
    AMEX {
        @Override
        public double calculateFee() {
            return LocalDateTime.now().getMonth().getValue() * 0.1;
        }
    };

    public abstract double calculateFee();

}
