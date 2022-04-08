package behavioral.command;

import java.util.Stack;

/**
 * @Author LMY
 * @Date 2022/4/7 10:17
 * @Version 1.0
 */
public class CommandHistory {
    private Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

}
