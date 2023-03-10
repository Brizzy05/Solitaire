package sample.cards;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestSuit
{
    @Test
    public void testSameColor()
    {
        assertTrue(Suit.CLUBS.sameColorAs(Suit.CLUBS));
        assertFalse(Suit.CLUBS.sameColorAs(Suit.DIAMONDS));
        assertFalse(Suit.CLUBS.sameColorAs(Suit.HEARTS));
        assertTrue(Suit.CLUBS.sameColorAs(Suit.SPADES));
        assertFalse(Suit.DIAMONDS.sameColorAs(Suit.CLUBS));
        assertTrue(Suit.DIAMONDS.sameColorAs(Suit.DIAMONDS));
        assertTrue(Suit.DIAMONDS.sameColorAs(Suit.HEARTS));
        assertFalse(Suit.DIAMONDS.sameColorAs(Suit.SPADES));
        assertFalse(Suit.HEARTS.sameColorAs(Suit.CLUBS));
        assertTrue(Suit.HEARTS.sameColorAs(Suit.DIAMONDS));
        assertTrue(Suit.HEARTS.sameColorAs(Suit.HEARTS));
        assertFalse(Suit.HEARTS.sameColorAs(Suit.SPADES));
        assertTrue(Suit.SPADES.sameColorAs(Suit.CLUBS));
        assertFalse(Suit.SPADES.sameColorAs(Suit.DIAMONDS));
        assertFalse(Suit.SPADES.sameColorAs(Suit.HEARTS));
        assertTrue(Suit.SPADES.sameColorAs(Suit.SPADES));

    }
}
