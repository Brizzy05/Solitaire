package testing.cards;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sample.cards.Card;
import sample.cards.CardStack;
import sample.cards.Rank;
import sample.cards.Suit;

public class TestCardStack
{
    private final static Card ACE_OF_CLUBS = Card.get(Rank.ACE, Suit.CLUBS);
    private final static Card TWO_OF_CLUBS = Card.get(Rank.TWO, Suit.CLUBS);

    private final CardStack aStack = new CardStack();

    @BeforeEach
    public void setUp()
    {
        aStack.clear();
    }

    @Test
    public void testClear()
    {
        aStack.clear();
        assertTrue(aStack.isEmpty());

        aStack.push(ACE_OF_CLUBS);
        aStack.push(TWO_OF_CLUBS);
        assertFalse(aStack.isEmpty());
        aStack.clear();
        assertTrue(aStack.isEmpty());
    }

    @Test
    public void testPeek()
    {
        aStack.push(ACE_OF_CLUBS);
        aStack.push(TWO_OF_CLUBS);
        assertSame(TWO_OF_CLUBS, aStack.peek());
        assertEquals(2, aStack.size());
    }

    @Test
    public void testPeek_int()
    {
        aStack.push(ACE_OF_CLUBS);
        aStack.push(TWO_OF_CLUBS);
        assertSame(ACE_OF_CLUBS, aStack.peek(0));
        assertSame(TWO_OF_CLUBS, aStack.peek(1));
    }

    @Test
    public void testPop()
    {
        aStack.push(ACE_OF_CLUBS);
        aStack.push(TWO_OF_CLUBS);
        assertSame(TWO_OF_CLUBS, aStack.pop());
        assertEquals(1, aStack.size());
    }

    @Test
    public void testPush()
    {
        aStack.push(ACE_OF_CLUBS);
        assertSame(ACE_OF_CLUBS, aStack.peek());
        assertEquals(1, aStack.size());
        aStack.push(TWO_OF_CLUBS);
        assertSame(TWO_OF_CLUBS, aStack.peek());
        assertEquals(2, aStack.size());
    }
}
