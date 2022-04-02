package creatinal.abstract_factory.checkboxes;

/**
 * @Author LMY
 * @Date 2022/4/2 10:59
 * @Version 1.0
 */
public class LinuxCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("这是一个LinuxCheckBox");
    }
}
