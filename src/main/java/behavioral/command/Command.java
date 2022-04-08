package behavioral.command;

/**
 * @Author LMY
 * @Date 2022/4/7 10:13
 * @Version 1.0
 *
 * base abstract command
 */
public abstract class Command {
    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}
