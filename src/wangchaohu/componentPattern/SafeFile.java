package wangchaohu.componentPattern;

/**
 * 安全组合模式
 *
 * 树叶 leaf
 * */
public class SafeFile implements SafeComponent{

    private String fileName;

    protected SafeFile(String fileName){
        this.fileName = fileName;
    }

    /*对于没有add，remove方法的树叶来说，只需要实现抽象构件即可*/
    @Override
    public void operate() {
        System.out.printf("--------访问 %s 文件\n",fileName);
    }
}
