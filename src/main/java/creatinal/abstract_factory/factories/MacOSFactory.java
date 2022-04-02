package creatinal.abstract_factory.factories;

import creatinal.abstract_factory.buttons.Button;
import creatinal.abstract_factory.buttons.MacOSButton;
import creatinal.abstract_factory.checkboxes.CheckBox;
import creatinal.abstract_factory.checkboxes.MacOSCheckbox;

/**
 * @Author LMY
 * @Date 2022/4/2 10:53
 * @Version 1.0
 */
public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckbox();
    }
}
