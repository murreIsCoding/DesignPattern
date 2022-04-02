package creatinal.factory_method;

import creatinal.factory_method.factory.Dialog;
import creatinal.factory_method.factory.HtmlDialog;
import creatinal.factory_method.factory.WindowsDialog;

/**
 * @Author LMY
 * @Date 2022/4/2 10:24
 * @Version 1.0
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }

    private static void configure() {
        //choose concrete dialog
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else if (System.getProperty("os.name").equals("Chrome")) {
            dialog = new HtmlDialog();
        } else {
            throw new RuntimeException("can't find suitable dialog");
        }
    }
}
