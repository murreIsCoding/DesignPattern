package creatinal_patterns.factory_method.buttons;

/**
 * @Author LMY
 * @Date 2022/4/2 10:18
 * @Version 1.0
 */
public class HtmlButton implements Button {

    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }


    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
