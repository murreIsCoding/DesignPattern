package behavioral.command;

/**
 * @Author LMY
 * @Date 2022/4/7 10:15
 * @Version 1.0
 * 从剪贴板粘贴文字
 */
public class PasteCommand extends Command {

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipboard == null || editor.clipboard.isEmpty()) return false;

        backup();
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }
}
