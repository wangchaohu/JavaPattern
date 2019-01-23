package wangchaohu.componentPattern;

/**
 * 抽象构件
 *
 * 这里是整个文件管理器的所有操作
 * */
public interface Component {
    void add(Component c);
    void delete(Component c);
    Component getChild(int i);
    void opereat();
}
