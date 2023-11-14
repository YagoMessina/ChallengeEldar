package com.yago.Eldar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CardHolder {

    private String name;
    private String surname;

    @Override
    public String toString() {
        return "CardHolder{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
