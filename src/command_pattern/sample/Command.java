package command_pattern.sample;

/**
 * Created by qeesung on 2016/11/13.
 */
public interface Command {
    String getCommandName(); // get the command name
    void run(); // run the command
}
