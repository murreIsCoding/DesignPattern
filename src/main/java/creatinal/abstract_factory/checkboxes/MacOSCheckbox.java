package creatinal.abstract_factory.checkboxes;

/**
 * @Author LMY
 * @Date 2022/4/2 10:52
 * @Version 1.0
 */
public class MacOSCheckbox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
