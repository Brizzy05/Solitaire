package sample.gui;

import sample.cards.Card;
import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;

public class CardMouseDrag implements EventHandler<MouseEvent>{
    private static final ClipboardContent CLIPBOARD_CONTENT = new ClipboardContent();

    private Card aCard;
    private ImageView aImageView;

    CardMouseDrag(ImageView pView )
    {
        aImageView = pView;
    }

    void setCard(Card pCard)
    {
        aCard = pCard;
    }

    @Override
    public void handle(MouseEvent pMouseEvent)
    {
        Dragboard db = aImageView.startDragAndDrop(TransferMode.ANY);
        CLIPBOARD_CONTENT.putString(aCard.getCardId());
        db.setContent(CLIPBOARD_CONTENT);
        pMouseEvent.consume();
    }
}
