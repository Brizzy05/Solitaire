package sample.cards;

import java.util.Comparator;

public class SuitComparator implements Comparator<Card> {
    public int compare(Card pCard1, Card pCard2)
    {
        return pCard1.getaSuit().ordinal() - pCard2.getaSuit().ordinal();
    }
}
