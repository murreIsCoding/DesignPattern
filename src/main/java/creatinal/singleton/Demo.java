package creatinal.singleton;

/**
 * @Author LMY
 * @Date 2022/4/8 16:27
 * @Version 1.0
 * enum实现单例
 */
public class Demo {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.SINGLETON;
        instance1.dosomething();
        Singleton instance2 = Singleton.SINGLETON;
        instance2.dosomething();
    }

}
