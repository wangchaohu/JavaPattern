package wangchaohu.singletonPattern;

/**
 * 饿汉式单例模式
 * */
public class HungrySingleton {
    //使用静态域维护实例
    private static final HungrySingleton hungrySingletonInstance = new HungrySingleton();

    //唯一的私有构造器
    private HungrySingleton(){}


    public static HungrySingleton getInstance(){
        return hungrySingletonInstance;
    }
}
