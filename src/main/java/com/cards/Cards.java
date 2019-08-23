package com.cards;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Cards {

    /**
     * Gamers: Alec and Bob.
     * Pre condition: BOth have the same number of cards.
     * Cards values from 14 to 2: A, K, Q, J, T, 9, 8, 7, 6, 5, 4, 3, 2
     * Objetive: How many games Alec won?
     * Example:
     *      Alec: "AK234KQ", Bob: "K7463JJ" -> 1100111 = 5
     **/

    private static final Map<Character, Integer> CARD_VALUES = new HashMap<Character, Integer>() {{
        put('A', 14);
        put('K', 13);
        put('Q', 12);
        put('J', 11);
        put('T', 10);
        put('9', 9);
        put('8', 8);
        put('7', 7);
        put('6', 6);
        put('5', 5);
        put('4', 4);
        put('3', 3);
        put('2', 2);
    }};

    public Integer check(String A, String B) {

        return IntStream
                .range(0, A.length())
                .map(i -> {
                    Integer alecCard = CARD_VALUES.get(A.charAt(i));
                    Integer bobCard = CARD_VALUES.get(B.charAt(i));
                    return alecCard > bobCard ? 1 : 0;
                }).sum();
    }
}
