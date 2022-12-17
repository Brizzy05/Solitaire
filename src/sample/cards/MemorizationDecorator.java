package sample.cards;

import java.util.ArrayList;
import java.util.List;

// implements the component
public class MemorizationDecorator implements CardSource{
    // here we have a reference to the component
    private CardSource aComponent;
    private List<Card> aMemory = new ArrayList<>();

    public MemorizationDecorator(CardSource pComponent)
    {
        //but we could pass in a component
        aComponent = pComponent;
    }

    @Override
    public Card draw() {
        // call draw from leaf or original class
        Card card = aComponent.draw();
        aMemory.add(card);
        return card;
    }

    @Override
    public boolean isEmpty() {
        return aComponent.isEmpty();
    }
}


