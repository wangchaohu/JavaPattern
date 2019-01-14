package wangchaohu.singletonPattern;

/**
 * 双重检查锁定单例模式
 *
 *
 * */
public class DoubleCheckLockSingleton {

    //使用静态域维护实例
    private volatile static DoubleCheckLockSingleton doubleCheckLockSingletonInstance = null;
    //唯一的私有构造器
    private DoubleCheckLockSingleton(){}
    //使用静态方法监视实例的创建
    public static synchronized DoubleCheckLockSingleton getInstance(){
        if (null == doubleCheckLockSingletonInstance){  // 第一次检查
            synchronized(DoubleCheckLockSingleton.class){
                if (null == doubleCheckLockSingletonInstance){  //第二次检查
                    doubleCheckLockSingletonInstance = new DoubleCheckLockSingleton();
                }
            }
        }
        return doubleCheckLockSingletonInstance;
    }
}
