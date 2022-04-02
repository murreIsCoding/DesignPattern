package creatinal.abstract_factory;

import creatinal.abstract_factory.factories.GUIFactory;
import creatinal.abstract_factory.factories.LinuxFactory;
import creatinal.abstract_factory.factories.MacOSFactory;
import creatinal.abstract_factory.factories.WindowsFactory;

/**
 * @Author LMY
 * @Date 2022/4/2 10:57
 * @Version 1.0
 */
public class Demo {
    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = "linux";
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else if (osName.contains("windows")) {
            factory = new WindowsFactory();
        } else if (osName.contains("linux")) {
            factory = new LinuxFactory();
        } else {
            throw new RuntimeException();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
