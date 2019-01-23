package wangchaohu.componentPattern;

/**
 * 文件管理器中的文件
 *
 * 即 树叶 leaf
 * */
public class File implements Component {

    private String name;

    protected File(String name){
        this.name = name;
    }

    @Override
    public void add(Component c) {
        System.out.println("文件不支持添加");
    }

    @Override
    public void delete(Component c) {
        System.out.println("文件不支持删除");
    }

    @Override
    public Component getChild(int i) {
        System.out.println("文件不支持此方法");
        return null;
    }

    @Override
    public void opereat() {
        System.out.printf("--------访问 %s 文件\n",name);
    }
}
