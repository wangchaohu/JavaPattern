package wangchaohu.componentPattern;


/**
 * 安全组合模式
 *
 * 这种方式是把抽象构件中不声明添加，删除等对构件进行操作管理的方法去除，让他们各自实现自己的方法
 *
 * 把共有的操作抽象出来
 * */
public interface SafeComponent {
    //文件和文件夹共有的操作
    void operate();
}
