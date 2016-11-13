package command_pattern.sample.commands;

import command_pattern.sample.Command;

/**
 * Created by qeesung on 2016/11/13.
 */
public class EmptyCommand implements Command {
    @Override
    public String getCommandName() {
        return "";
    }

    @Override
    public void run() {
        // do nothing here
    }
}
