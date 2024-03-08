package schmidt.command;

import schmidt.exception.SchmidtException;
import schmidt.storage.Storage;
import schmidt.task.TaskList;
import schmidt.ui.Ui;

/**
 * Represents a command to display the help message.
 */
public class HelpCommand extends Command {

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws SchmidtException {
        ui.printHelpMessage();
    }
}
