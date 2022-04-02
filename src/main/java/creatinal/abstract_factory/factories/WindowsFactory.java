package creatinal.abstract_factory.factories;

import creatinal.abstract_factory.buttons.Button;
import creatinal.abstract_factory.buttons.WindowsButton;
import creatinal.abstract_factory.checkboxes.CheckBox;
import creatinal.abstract_factory.checkboxes.WindowsCheckbox;

/**
 * @Author LMY
 * @Date 2022/4/2 10:53
 * @Version 1.0
 */
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckbox();
    }
}
