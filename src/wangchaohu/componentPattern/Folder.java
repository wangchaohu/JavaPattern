package wangchaohu.componentPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件管理器中的文件夹
 *
 * 即 树枝构件
 * */
public class Folder implements Component {

    private String message;
    private List<Component> files = new ArrayList<>();

    protected Folder(String message){
        this.message = message;
    }

    @Override
    public void add(Component c) {

        files.add(c);
    }

    @Override
    public void delete(Component c) {
        files.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return files.get(i);
    }

    @Override
    public void opereat() {
        System.out.printf("----访问 %s 文件夹\n", message);
        for (Component component : files) {
            component.opereat();

        }
    }
}
