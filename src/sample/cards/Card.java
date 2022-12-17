package sample.cards;

// what is card
// Card class could be one of 52 cards

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Card implements Comparable<Card> {
    // cards are created using flyweight

    private Rank aRank;
    private Suit aSuit;

    private static final Map<Suit, Map<Rank, Card>> aCards = new HashMap<Suit, Map<Rank, Card>>();

    static
    {
        for(Suit suit : Suit.values())
        {
            aCards.put(suit, new HashMap());
            for(Rank rank: Rank.values())
            {
                aCards.get(suit).put(rank, new Card(rank, suit));
            }
        }
    }

    public static Card get(Rank pRank, Suit pSuit)
    {
        assert pRank != null && pSuit != null;
        return aCards.get(pSuit).get(pRank);
    }

    public static Card get( String pId )
    {
        assert pId != null;
        int id = Integer.parseInt(pId);
        return get(Rank.values()[id % Rank.values().length],
                Suit.values()[id / Rank.values().length]);
    }

    /**
     * @param pRank
     * @param pSuit
     * @pre pRank != null && pSuit != null
     */
    private Card(Rank pRank, Suit pSuit)
    {
        assert pRank != null && pSuit != null;
        aRank = pRank;
        aSuit = pSuit;
    }

    public Rank getaRank() {
        return aRank;
    }

    public Suit getaSuit() {
        return aSuit;
    }

    /**
     *
     * @return String
     */
    @Override
    public String toString() {
        return "" + aRank + " of " + aSuit;
    }

    public String getCardId()
    {
        return Integer.toString(aSuit.ordinal() * aRank.values().length + aRank.ordinal());
    }

    /**
     * Compare by rank
     * @param pCard
     * @return int
     */
    @Override
    public int compareTo(Card pCard) {
         return aRank.ordinal() - pCard.aRank.ordinal();
    }


    @Override
    public boolean equals(Object pOther)
    {
        if( pOther == this)
        { // check for the same hashcode or same object
            return true;
        }
        else if( pOther == null)
        {
            return false;
        }
        else if(pOther.getClass() != this.getClass())
        {
            return false;
        }
        Card other = (Card) pOther; // downcast safely
        return aRank == other.aRank && aSuit == other.aSuit;
// if aRank and aSuit was another class
// we could use aRank.equals(other.aRank) but what if aRank is null
// use return Objects.equals(aRank, other.aRank)
    }
    @Override
    public int hashCode()
    {
        return aSuit.ordinal() * aRank.values().length + aRank.ordinal();
    }

}
