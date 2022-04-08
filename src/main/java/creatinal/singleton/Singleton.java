package creatinal.singleton;

/**
 * @Author LMY
 * @Date 2022/4/8 16:21
 * @Version 1.0
 */
public enum Singleton {
    SINGLETON;


    Singleton() {
        System.out.println("I am initializing!");
    }

    public void dosomething() {
        System.out.println("do something");
    }

}
