package creatinal.abstract_factory.factories;

import creatinal.abstract_factory.buttons.Button;
import creatinal.abstract_factory.buttons.LinuxBotton;
import creatinal.abstract_factory.checkboxes.CheckBox;
import creatinal.abstract_factory.checkboxes.LinuxCheckBox;

/**
 * @Author LMY
 * @Date 2022/4/2 11:00
 * @Version 1.0
 */
public class LinuxFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return  new LinuxBotton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LinuxCheckBox();
    }
}
