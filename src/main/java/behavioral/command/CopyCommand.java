package behavioral.command;

/**
 * @Author LMY
 * @Date 2022/4/7 10:15
 * @Version 1.0
 * 将所选文字复制到 剪贴板
 */
public class CopyCommand extends Command{
    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
