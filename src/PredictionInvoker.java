import java.util.List;
import java.util.ArrayList;

/**
 * PredictionInvoker
 * The invoker responsible for executing commands in the Command pattern. Works sort of like a one-button
 * TV remote?
 * Part of the Command pattern.
 *
 * @author Hudson Miller
 */


public class PredictionInvoker {
    private List<Command> commands = new ArrayList<>();

    /**
     * Adds a command to the commands list.
     *
     * @param command
     */
    public void addCommand(Command command){
        commands.add(command);
    }

    /**
     * Executes commands in order of addition.
     */
    public void executeCommands(){
        for (int i = 0; i < commands.size(); i++) {
            commands.get(i).execute();
        }
    }
}