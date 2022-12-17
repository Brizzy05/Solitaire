package testing.cards;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import sample.cards.*;

public class TestDeck
{
    @Test
    public void testdraw()
    {
        Deck lDeck = new Deck();
        lDeck.shuffle();
        Set<Card> lCards = new HashSet<Card>();
        for( int i = 0; i < 52; i++ )
        {
            Card lCard = lDeck.draw();
            assertFalse( lCards.contains(lCard));
            lCards.add( lCard );
        }
        assertTrue( lDeck.isEmpty() );
    }
}
