package command_pattern.sample.commands;

import command_pattern.sample.Command;

/**
 * Created by qeesung on 2016/11/13.
 */
public class Command1 implements Command{
    @Override
    public String getCommandName() {
        return "command1";
    }

    @Override
    public void run() {
        System.out.println("run command 1");
    }
}
