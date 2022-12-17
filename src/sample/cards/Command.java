package sample.cards;

import java.util.Optional;

public interface Command {
    Optional<Card> execute();
    void undo();
}
