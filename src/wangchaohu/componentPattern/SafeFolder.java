package wangchaohu.componentPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 安全组合模式
 *
 * 树枝
 * */
public class SafeFolder  implements SafeComponent{
    private String folderName;
    private List<SafeComponent> safeComponentList = new ArrayList<>();

    protected SafeFolder(String folderName){
        this.folderName = folderName;
    }

    /*对于文件夹（树枝）来说，除了实现抽象构件的方法之外，还需要自己提供add，remove等操作*/

    @Override
    public void operate() {
        System.out.printf("----访问 %s 文件夹\n",folderName);
        for (SafeComponent safeComponent : safeComponentList){
            safeComponent.operate();
        }
    }

    protected void add(SafeComponent component){
        this.safeComponentList.add(component);
    }

    protected void remove(SafeComponent component){
        this.safeComponentList.remove(component);
    }

    protected SafeComponent getChild(int i){
        return this.safeComponentList.get(i);
    }

}
