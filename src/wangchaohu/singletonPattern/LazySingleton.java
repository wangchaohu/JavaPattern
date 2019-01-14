package wangchaohu.singletonPattern;


/**
 * 懒汉式单例模式
 *
 * 这种方式只能在单线程中使用，线程不安全
 */

public class LazySingleton {
    private static LazySingleton lazySingletonInstance = null;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if (null == lazySingletonInstance){
            lazySingletonInstance = new LazySingleton();
        }
        return lazySingletonInstance;
    }
}

/**
* 懒汉式单例模式
 *
 * 这种方式线程安全，可以在多线程中使用，但是效率较低
*/

class LazyerSingleton{
    private static LazyerSingleton lazyerSingletonInstance = null;

    private LazyerSingleton(){}

    public static synchronized LazyerSingleton getInstance(){
        if (null == lazyerSingletonInstance){
            lazyerSingletonInstance = new LazyerSingleton();
        }
        return lazyerSingletonInstance;
    }
}
