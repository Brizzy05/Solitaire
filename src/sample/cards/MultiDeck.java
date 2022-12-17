package sample.cards;

public class MultiDeck implements CardSource, Cloneable{
    private Deck[] aDecks;

    public MultiDeck(int pNumOfDecks)
    {
        aDecks = new Deck[pNumOfDecks];
        addDecks();
    }

    private void addDecks()
    {
        for (int i=0; i < aDecks.length; i++)
        {
            aDecks[i] = new Deck();
        }
    }

    public Card draw()
    {
        assert !isEmpty();

        for (Deck deck : aDecks)
        {
            if (!deck.isEmpty())
            {
                return deck.draw();
            }
        }
        // never reaching here
       return null;
    }

    public boolean isEmpty()
    {
        for (Deck deck : aDecks)
        {
            if (!deck.isEmpty())
            {
                return false;
            }
        }
        // if we never find a nonEmpty deck
        assert false;
        return true;
    }

    @Override
    public CardSource clone() {
        try {
            MultiDeck clone = (MultiDeck) super.clone();
            clone.aDecks = clone.aDecks.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
           assert false;
           return null;
        }

    }

}
