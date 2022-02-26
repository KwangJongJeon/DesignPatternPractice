package commandPattern.practice;

import commandPattern.Command;

public class NoCommand implements Command {
    public NoCommand() {
    }

    @Override
    public void execute() {
        System.out.println("No Command");
    }
}
