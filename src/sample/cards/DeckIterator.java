package sample.cards;

import java.util.Iterator;
import java.util.List;

public class DeckIterator implements Iterator<Card> {
    int index = 0;
    List<Card> aList;

    public DeckIterator(List<Card> pList)
    {
        aList = pList;
    }


    @Override
    public boolean hasNext() {
        if (index >= aList.size())
            return false;
        else
            return true;
    }

    @Override
    public Card next() {
        Card tmp = aList.get(index);
        index++;
        return tmp;

    }
}
