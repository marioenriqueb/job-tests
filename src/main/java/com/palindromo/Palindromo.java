package com.palindromo;

import java.util.stream.IntStream;

public class Palindromo {

    public long checkPalindromos(int x, int y) {
        return IntStream.range(x, y).filter(n -> check(String.valueOf(n))).count();
    }

    /**
    * Pre condition: a String
    * Objetive: is the string a polindromo?
    * Example:
    *       holaaloh = true
    *       holachau = false
    * */

    public Boolean check(String value) {
        value = value.trim();

        String temp  = value.trim().toLowerCase();
        return IntStream.range(0, temp.length() / 2)
                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
    }
}
