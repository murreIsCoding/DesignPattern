package creatinal.factory_method.factory;

import creatinal.factory_method.buttons.Button;

/**
 * @Author LMY
 * @Date 2022/4/2 10:20
 * @Version 1.0
 */
public abstract class Dialog {
    public void renderWindow() {
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();
}
