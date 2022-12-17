package sample.gui;

import javafx.geometry.Insets;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import sample.cards.Card;
import sample.cards.CardImages;
import sample.model.GameModel;
import sample.model.GameModelListener;

/**
 * Component that shows the state of the discard pile and allows
 * dragging cards from it.
 */
class DiscardPileView extends HBox implements GameModelListener
{
    private static final int PADDING = 5;
    private CardMouseDrag aDragHandler;
    private final GameModel aModel;

    DiscardPileView(GameModel pModel)
    {
        aModel = pModel;
        setPadding(new Insets(PADDING));
        final ImageView image = new ImageView(CardImages.getBack());
        image.setVisible(false);
        getChildren().add(image);
        aDragHandler = new CardMouseDrag(image);
        image.setOnDragDetected(aDragHandler);
        aModel.addListener(this);
    }

    @Override
    public void gameStateChanged()
    {
        if( aModel.isDiscardPileEmpty())
        {
            getChildren().get(0).setVisible(false);
        }
        else
        {
            getChildren().get(0).setVisible(true);
            Card topCard = aModel.peekDiscardPile();
            ImageView image = (ImageView)getChildren().get(0);
            image.setImage(CardImages.getCard(topCard));
            aDragHandler.setCard(topCard);
        }
    }
}
