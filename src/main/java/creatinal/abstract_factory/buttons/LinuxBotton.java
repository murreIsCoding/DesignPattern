package creatinal.abstract_factory.buttons;

/**
 * @Author LMY
 * @Date 2022/4/2 10:58
 * @Version 1.0
 */
public class LinuxBotton implements Button{
    @Override
    public void paint() {
        System.out.println("这是一个linux button");
    }
}
