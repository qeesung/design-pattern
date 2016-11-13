package command_pattern.sample;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qeesung on 2016/11/13.
 */
public class CommandController {
    public List<Command> commandList = new LinkedList<>();

    public void register(Command command){
        commandList.add(command); // simple add the command
    }

    public void remove(String commandName){
        Command tempCommand = getCommand(commandName);
        if(tempCommand != null)
            commandList.remove(tempCommand);
    }

    public void runCommand(String commandName){
        Command targetCommand = getCommand(commandName);
        if(targetCommand != null)
            targetCommand.run();
    }

    public Command getCommand(String commandName){
        for (Command command : commandList ) {
            if(command.getCommandName().equals(commandName))
                return command;
        }
        return null;
    }
}
