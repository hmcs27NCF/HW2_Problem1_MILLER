/**
 * PredictionCommand
 * A command that instantiates PredictionModel and calls its runModel() method.
 * Part of the Command pattern.
 * Implements the Command interface.
 *
 * @author Hudson Miller
 */

public class PredictionCommand implements Command {
    private PredictionModel model = new PredictionModel();
    public void execute(){
        model.runModel();
    }
}
