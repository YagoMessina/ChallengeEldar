package com.yago.Eldar;

import com.yago.Eldar.model.Card;
import com.yago.Eldar.model.CardBrand;
import com.yago.Eldar.model.CardHolder;
import com.yago.Eldar.model.Operation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.Month;

public class Ejercicio1 {

    private static final int MAX_AMOUNT = 1000;

    private static void showCardInfo(Card card) {
        System.out.println(card.toString());
    }

    private static void isValidOperation(BigDecimal amount) {
        String message = amount.intValue() <= MAX_AMOUNT ? "The operation is valid." : "The operation is invalid.";
        System.out.println(message);
    }

    private static void isValidCard(Card card) {
        String message = card.isExpired() ? "The card is invalid." : "The card is valid.";
        System.out.println(message);
    }

    private static boolean isNotEqual(Card card1, Card card2) {
        return !card1.equals(card2);
    }

    private static void printOperationFee(BigDecimal amount, Card card) {
        BigDecimal fee = BigDecimal.valueOf(card.getBrand().calculateFee());
        System.out.println("Operation fee: " +
                amount.multiply(fee).divide(BigDecimal.valueOf(100), RoundingMode.HALF_UP));
    }

    public static void solve(Operation operation) {
        Card card = operation.getCard();
        BigDecimal amount = operation.getAmount();

        showCardInfo(card);
        isValidOperation(amount);
        isValidCard(card);
        printOperationFee(amount, card);
        System.out.println();
    }

    public static void main(String[] args) {
        CardHolder cardHolder = new CardHolder("Yago", "Messina");
        Card card1 = new Card(CardBrand.VISA, 312132312, cardHolder,
                LocalDateTime.of(2022, Month.APRIL, 10, 10, 10));
        Card card2 = new Card(CardBrand.AMEX, 312132312, cardHolder,
                LocalDateTime.of(2024, Month.APRIL, 10, 10, 10));

        Operation operation1 = new Operation(BigDecimal.valueOf(1000), card1);
        Operation operation2 = new Operation(BigDecimal.valueOf(500), card2);
        Operation operation3 = new Operation(BigDecimal.valueOf(1200), card1);

        solve(operation1);
        solve(operation2);
        solve(operation3);
    }
}
