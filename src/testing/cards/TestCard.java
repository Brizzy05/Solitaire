package testing.cards;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import sample.cards.Card;
import sample.cards.Rank;
import sample.cards.Suit;

public class TestCard
{
    @Test
    public void testToIDString()
    {
        assertEquals("0", Card.get(Rank.ACE, Suit.CLUBS).getCardId());
        assertEquals("9", Card.get(Rank.TEN, Suit.CLUBS).getCardId());
        assertEquals("12", Card.get(Rank.KING, Suit.CLUBS).getCardId());
        assertEquals("13", Card.get(Rank.ACE, Suit.DIAMONDS).getCardId());
        assertEquals("26", Card.get(Rank.ACE, Suit.HEARTS).getCardId());
        assertEquals("39", Card.get(Rank.ACE, Suit.SPADES).getCardId());
    }

    @Test
    public void testFromIDString()
    {
        assertEquals(Card.get(Rank.ACE, Suit.CLUBS), Card.get("0"));
        assertEquals(Card.get(Rank.TEN, Suit.CLUBS), Card.get("9"));
        assertEquals(Card.get(Rank.KING, Suit.CLUBS), Card.get("12"));
        assertEquals(Card.get(Rank.ACE, Suit.DIAMONDS), Card.get("13"));
        assertEquals(Card.get(Rank.ACE, Suit.HEARTS), Card.get("26"));
        assertEquals(Card.get(Rank.ACE, Suit.SPADES), Card.get("39"));
    }

    @Test
    public void testToString()
    {
        assertEquals("ACE of CLUBS", Card.get(Rank.ACE, Suit.CLUBS).toString());
        assertEquals("TWO of CLUBS", Card.get(Rank.TWO, Suit.CLUBS).toString());
        assertEquals("KING of CLUBS", Card.get(Rank.KING, Suit.CLUBS).toString());
        assertEquals("ACE of DIAMONDS", Card.get(Rank.ACE, Suit.DIAMONDS).toString());
        assertEquals("TWO of DIAMONDS", Card.get(Rank.TWO, Suit.DIAMONDS).toString());
        assertEquals("KING of DIAMONDS", Card.get(Rank.KING, Suit.DIAMONDS).toString());
        assertEquals("ACE of HEARTS", Card.get(Rank.ACE, Suit.HEARTS).toString());
        assertEquals("TWO of HEARTS", Card.get(Rank.TWO, Suit.HEARTS).toString());
        assertEquals("KING of HEARTS", Card.get(Rank.KING, Suit.HEARTS).toString());
        assertEquals("ACE of SPADES", Card.get(Rank.ACE, Suit.SPADES).toString());
        assertEquals("TWO of SPADES", Card.get(Rank.TWO, Suit.SPADES).toString());
        assertEquals("KING of SPADES", Card.get(Rank.KING, Suit.SPADES).toString());
    }
}
