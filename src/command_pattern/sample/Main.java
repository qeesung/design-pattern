package command_pattern.sample;

import command_pattern.sample.commands.Command1;
import command_pattern.sample.commands.Command2;
import command_pattern.sample.commands.Command3;

import java.io.Console;
import java.util.Scanner;

/**
 * Created by qeesung on 2016/11/13.
 */
public class Main {
    public static void main(String ... args){
        CommandController controller = new CommandController();
        controller.register(new Command1());
        controller.register(new Command2());
        controller.register(new Command3());

        String input = "";
        while(!input.equals("q")){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter command:");
            input = scanner.next();
            controller.runCommand(input);
        }
    }
}
