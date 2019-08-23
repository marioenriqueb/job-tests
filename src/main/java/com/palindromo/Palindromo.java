package com.palindromo;

import java.util.stream.IntStream;

public class Palindromo {

    /**
    * Pre condition: a String
    * Objetive: is the string a polindromo?
    * Example:
    *       holaaloh = true
    *       holachau = false
    * */

    public Boolean check(String leters) {

        leters = leters.trim();

        if (leters.isEmpty() || leters.length() % 2 > 0) {
            return Boolean.FALSE;
        }

        String temp  = leters.trim().toLowerCase();
        return IntStream.range(0, temp.length() / 2)
                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
    }
}
