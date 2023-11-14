package com.yago.Eldar;

import java.util.Locale;

public class Ejercicio5 {

    private static String solve(String[] array) {
        return String.join(" ", array)
                .toLowerCase(Locale.ROOT);
    }

    public static void main(String[] args) {
        String[] array = new String[]{"FirstWord", "SecondWord", "THIRDWORD"};
        System.out.println(solve(array));
    }
}
