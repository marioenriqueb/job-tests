package com.percentage;

import com.palindromo.Palindromo;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PercentageTest {

    private Percentage percentage;

    @Before
    public void init() {
        this.percentage = new Percentage();
    }

    @Test
    public void test1() {
        String[] tests = { "test1a", "test2", "test1b", "test1c", "test3"};
        String[] results = { "Wrong answer", "OK", "Runtime error", "OK", "Time limit exceeded" };

        System.out.println("Final Percentage = " + this.percentage.check(tests, results));
    }

    @Test
    public void test2() {
        String[] tests = { "codility1", "codility3", "codility4", "codility1b", "codility2"};
        String[] results = { "Wrong answer", "OK", "OK", "OK", "Time limit exceeded" };

        System.out.println("Final Percentage = " + this.percentage.check(tests, results));
    }
}
