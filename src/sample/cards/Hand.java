package sample.cards;

import javax.management.openmbean.CompositeType;
import java.util.*;

public class Hand implements  Iterable<Card>, Comparable<Hand> {
    private List<Card>  aHand = new ArrayList<>();
    private int maxSize;

    public Hand(int N)
    {
        Deck source = new Deck();

        maxSize = N;


    }



    @Override
    public Iterator<Card> iterator() {
        return aHand.iterator();
    }



    public boolean remove(Card pCard) {
        assert pCard != null;
        assert !isEmpty();
        return aHand.remove(pCard);
    }


    public boolean isEmpty() {
        return aHand.isEmpty();
    }

    public boolean isFull()
    {
        return aHand.size() >= maxSize;
    }

    public boolean contains(Card pCard)
    {
        for(Card card : aHand)
        {
            if (card == pCard)
            {return true;}
        }
        return false;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public int size()
    {
        return aHand.size();
    }

    @Override
    public int compareTo(Hand pHand)
    {
        return maxSize - pHand.maxSize;
    }

    //factory method
    public Comparator<Hand> descendingOrder()
    {

        return new Comparator<Hand>() {
            @Override
            public int compare(Hand pHand1, Hand pHand2) {
                return pHand2.compareTo(pHand1);
            }
        };

    }

    public Comparator<Hand> ascendingOrder()
    {

        return new Comparator<Hand>() {
            @Override
            public int compare(Hand pHand1, Hand pHand2) {
                return pHand1.compareTo(pHand2);
            }
        };

    }




}
