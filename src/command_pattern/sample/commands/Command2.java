package command_pattern.sample.commands;

import command_pattern.sample.Command;

/**
 * Created by qeesung on 2016/11/13.
 */
public class Command2 implements Command {
    @Override
    public String getCommandName() {
        return "command2";
    }

    @Override
    public void run() {
        System.out.println("run command 2");
    }
}
