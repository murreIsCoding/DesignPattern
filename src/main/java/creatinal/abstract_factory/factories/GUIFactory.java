package creatinal.abstract_factory.factories;

import creatinal.abstract_factory.buttons.Button;
import creatinal.abstract_factory.checkboxes.CheckBox;

/**
 * @Author LMY
 * @Date 2022/4/2 10:53
 * @Version 1.0
 */
public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
