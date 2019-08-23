package com.cards;

import org.junit.Before;
import org.junit.Test;

public class CardsTest {

    private Cards cards;

    @Before
    public void init() {
        this.cards = new Cards();
    }

    @Test
    public void test() {
        testGame(new String[] { "A", "K" });
        testGame(new String[] { "5", "K" });
        testGame(new String[] { "5J", "J5" });
        testGame(new String[] { "3", "3" });
        testGame(new String[] { "AKQ234KQ", "AKQ234KQ" });
        testGame(new String[] { "AK234KQ", "K7463JJ" });
        testGame(new String[] { "87463JJ", "AKT34KQ" });
        testGame(new String[] { "AKQ234Q", "6732544" });
    }

    private void testGame(String[] cards) {
        System.out.println("Alec: " + cards[0] + ", Bob: " + cards[1] + " = " + this.cards.check(cards[0], cards[1]));
    }
}
