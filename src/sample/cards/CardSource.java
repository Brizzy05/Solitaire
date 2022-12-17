package sample.cards;

import java.util.Iterator;

public interface CardSource {
    static CardSource NULL = new CardSource()
    {
        public boolean isEmpty()
        {
            return true;
        }

        @Override
        public CardSource clone() {
            return NULL;
        }

        public Card draw()
        {
            assert !isEmpty();
            return null;
        }

        public boolean isNull()
        {
            return true;
        }
    };
    /**
     *
     * @return Card
     * @pre !isEmpty()
     */
    Card draw();

    /**
     *
     * @return True if no more cards
     */
    boolean isEmpty();
}
