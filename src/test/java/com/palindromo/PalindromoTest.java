package com.palindromo;

import org.junit.Before;
import org.junit.Test;

public class PalindromoTest {

    private Palindromo palindromo;

    @Before
    public void init() {
        this.palindromo = new Palindromo();
    }

    @Test
    public void test() {
        String cadeia = "holaaloh";
        System.out.println(cadeia + ": " + this.palindromo.check(cadeia));

        cadeia = "holachau";
        System.out.println(cadeia + ": " + this.palindromo.check(cadeia));

        cadeia = "abcdeedcba";
        System.out.println(cadeia + ": " + this.palindromo.check(cadeia));

        cadeia = "abcde";
        System.out.println(cadeia + ": " + this.palindromo.check(cadeia));

        cadeia = "123456789987654321";
        System.out.println(cadeia + ": " + this.palindromo.check(cadeia));

        cadeia = "12345678987654321";
        System.out.println(cadeia + ": " + this.palindromo.check(cadeia));
    }
}
