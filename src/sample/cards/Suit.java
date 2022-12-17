package sample.cards;

public enum Suit {
    CLUBS, DIAMONDS, HEARTS, SPADES;

    // checking for the colors of the suits
    public boolean sameColorAs(Suit pSuit)
    {
        assert pSuit != null;
        if( this == CLUBS || this == SPADES )
        {
            return pSuit == CLUBS || pSuit == SPADES;
        }
        else
        {
            return pSuit == DIAMONDS || pSuit == HEARTS;
        }
    }
}
