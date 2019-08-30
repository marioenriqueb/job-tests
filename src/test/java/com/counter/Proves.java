package com.counter;

public class Proves {
    public static void main(String[] args) {
        System.out.println("result: " + (Integer.valueOf(168) == Integer.valueOf(168)));
        System.out.println("result: " + (Integer.valueOf(167) == Integer.valueOf(167)));
        System.out.println("result: " + (Integer.valueOf(128) == Integer.valueOf(128)));
        System.out.println("result: " + (Integer.valueOf(127) == Integer.valueOf(127)));
        System.out.println("result: " + (Integer.valueOf(168).equals(Integer.valueOf(168))));
        System.out.println("result: " + (Integer.valueOf(15) == Integer.valueOf(15)));
        System.out.println("result: " + (Integer.valueOf(15).equals(Integer.valueOf(15))));
        System.out.println("result: " + (168 == 168));
    }
}
