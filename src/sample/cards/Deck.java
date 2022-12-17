package sample.cards;

// Deck represents a normal 52 deck of cards
// we initialize all 52 cards in here
// The first way is manually create all cards by using a list of suit and rank
// we can also represent a card by a 6 binary digits, great but hard to visualize each cards
// A simpler way would be to call on enum class Suit and Rank

import java.util.*;

public class Deck  {

    public static void main(String[] args) {
    }

    private CardStack aCards;

    /**
     * Creates a new deck of 52 cards, shuffled.
     */
    public Deck()
    {
        shuffle();
    }

    /**
     * Reinitializes the deck with all 52 cards, and shuffles them.
     */
    public void shuffle()
    {
        List<Card> cards = new ArrayList<>();
        for( Suit suit : Suit.values() )
        {
            for( Rank rank : Rank.values() )
            {
                cards.add( Card.get( rank, suit ));
            }
        }
        Collections.shuffle(cards);
        aCards = new CardStack(cards);
    }

    /**
     * Places pCard on top of the deck.
     * @param pCard The card to place on top of the deck.
     * @pre pCard !=null
     */
    public void push(Card pCard)
    {
        assert pCard != null;
        aCards.push(pCard);
    }

    /**
     * Draws a card from the deck and removes the card from the deck.
     * @return The card drawn.
     * @pre !isEmpty()
     */
    public Card draw()
    {
        assert !isEmpty();
        return aCards.pop();
    }

    /**
     * @return True iff there are no cards in the deck.
     */
    public boolean isEmpty()
    {
        return aCards.isEmpty();
    }
}
