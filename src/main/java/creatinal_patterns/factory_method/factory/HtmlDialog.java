package creatinal_patterns.factory_method.factory;

import creatinal_patterns.factory_method.buttons.Button;
import creatinal_patterns.factory_method.buttons.HtmlButton;

/**
 * @Author LMY
 * @Date 2022/4/2 10:22
 * @Version 1.0
 */
public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
