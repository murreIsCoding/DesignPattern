package creatinal.abstract_factory.buttons;

/**
 * @Author LMY
 * @Date 2022/4/2 10:50
 * @Version 1.0
 */
public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
