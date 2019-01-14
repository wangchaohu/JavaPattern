package wangchaohu.singletonPattern;


/**
 * 静态内部类单例模式（推荐)
 * */
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton(){}

    private static class StaticInnerClass{
        private final static StaticInnerClassSingleton staticInnerClassSingletonInstance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return StaticInnerClass.staticInnerClassSingletonInstance;
    }
}
