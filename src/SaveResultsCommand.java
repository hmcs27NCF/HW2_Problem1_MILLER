/**
 * SaveResultsCommand
 * A command that instantiates ResultSaver and calls its saveResult() method.
 * Implements the Command interface.
 * Part of the Command pattern.
 *
 * @author Hudson Miller
 */

public class SaveResultsCommand implements Command {
    private ResultSaver saver = new ResultSaver();
    public void execute(){
        saver.saveResult();
    }
}
