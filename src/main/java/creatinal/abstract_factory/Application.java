package creatinal.abstract_factory;

import creatinal.abstract_factory.buttons.Button;
import creatinal.abstract_factory.checkboxes.CheckBox;
import creatinal.abstract_factory.factories.GUIFactory;

/**
 * @Author LMY
 * @Date 2022/4/2 10:55
 * @Version 1.0
 */
public class Application {
    private Button button;
    private CheckBox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}