package com.palindromo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromoTest {

    private Palindromo palindromo;

    @Before
    public void init() {
        this.palindromo = new Palindromo();
    }

    @Test
    public void testCheck() {
        Assert.assertTrue(this.palindromo.check("holaaloh"));
        Assert.assertTrue(this.palindromo.check("holaloh"));
        Assert.assertFalse(this.palindromo.check("avo"));
        Assert.assertTrue(this.palindromo.check("ovo"));
        Assert.assertFalse(this.palindromo.check("holachau"));
        Assert.assertTrue(this.palindromo.check("abcdeedcba"));
        Assert.assertFalse(this.palindromo.check("abcde"));
        Assert.assertTrue(this.palindromo.check("123456789987654321"));
        Assert.assertTrue(this.palindromo.check("12345678987654321"));
    }

    @Test
    public void testPalindromos() {
        Assert.assertEquals(2, this.palindromo.checkPalindromos(9, 12));
        Assert.assertEquals(1, this.palindromo.checkPalindromos(10, 20));
        Assert.assertEquals(9, this.palindromo.checkPalindromos(10, 100));
        Assert.assertEquals(19, this.palindromo.checkPalindromos(10, 200));
        Assert.assertEquals(10, this.palindromo.checkPalindromos(1000, 2000));
    }
}
