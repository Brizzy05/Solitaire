package sample.ai;


import sample.model.GameModelView;
import sample.model.Move;

/**
 * Never does anything.
 */
public class NullAgent implements PlayingAgent
{
    /**
     * Creates a new strategy.
     */
    public NullAgent() {}

    @Override
    public Move getLegalMove(GameModelView pModel)
    {
        return pModel.getNullMove();
    }
}
