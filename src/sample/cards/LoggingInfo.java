package sample.cards;

public class LoggingInfo implements CardSource {
    // here we have a reference to the component
    private CardSource aComponent;


    public LoggingInfo(CardSource pComponent) {
        aComponent = pComponent;
    }

    @Override
    public Card draw() {
        // call draw from leaf or original class
        Card card = aComponent.draw();
        System.out.println("Card drawn: " + card);
        return card;
    }

    @Override
    public boolean isEmpty() {
        return aComponent.isEmpty();
    }
}
