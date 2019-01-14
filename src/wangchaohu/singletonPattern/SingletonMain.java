package wangchaohu.singletonPattern;


/**
 * 单例模式入口函数
 * */
public class SingletonMain {
    public static void main(String[] args){

        //测试饿汉式单例模式
        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();

        System.out.println("hungrySingleton1:::"+hungrySingleton1);
        System.out.println("hungrySingleton2:::"+hungrySingleton2);
        System.out.println("hungrySingleton1 ==  hungrySingleton2 ?:::" + (hungrySingleton1 == hungrySingleton2));

        System.out.println();
        //懒汉式单例模式
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println("lazySingleton1:::"+hungrySingleton1);
        System.out.println("lazySingleton2:::"+hungrySingleton2);
        System.out.println("lazySingleton1 ==  lazySingleton2 ?:::" + (lazySingleton1 == lazySingleton2));
        System.out.println();
        //双重检查锁定 单例模式
        DoubleCheckLockSingleton doubleCheckLockSingleton1 = DoubleCheckLockSingleton.getInstance();
        DoubleCheckLockSingleton doubleCheckLockSingleton2 = DoubleCheckLockSingleton.getInstance();
        System.out.println("doubleCheckLockSingleton1:::"+hungrySingleton1);
        System.out.println("doubleCheckLockSingleton2:::"+hungrySingleton2);
        System.out.println("doubleCheckLockSingleton1 ==  doubleCheckLockSingleton2 ?:::" + (doubleCheckLockSingleton1 == doubleCheckLockSingleton2));
        System.out.println();

        //静态内部类单例模式
        StaticInnerClassSingleton staticInnerClassSingleton1 = StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton staticInnerClassSingleton2 = StaticInnerClassSingleton.getInstance();
        System.out.println("staticInnerClassSingleton1:::"+hungrySingleton1);
        System.out.println("staticInnerClassSingleton2:::"+hungrySingleton2);
        System.out.println("staticInnerClassSingleton1 ==  staticInnerClassSingleton2 ?:::" + (staticInnerClassSingleton1 == staticInnerClassSingleton2));

    }
}
