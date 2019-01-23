package wangchaohu.componentPattern;

/**
 * 组合模式主入口
 *
 * 文件管理器client
 * */
public class ComponentPatternMain {
    public static void main(String[] main){

        //透明组合模式
        Component fileManager = new Folder("文件管理器");

        Component a = new Folder("a");  //a文件夹
        Component b = new File("b");  //b文件
        Component c = new File("c");  //c文件
        fileManager.add(a);
        fileManager.add(b);
        fileManager.add(c);

        Component aa = new Folder("aa"); //aa文件夹
        Component a1 = new File("a1"); //a1文件
        a.add(aa);
        a.add(a1);
        Component aaa = new Folder("aaa");//aaa文件夹
        Component aa1 = new File("aa1");//aa1文件
        aa.add(aaa);
        aa.add(aa1);

        fileManager.opereat();

        //安全组合模式
        SafeFolder safeFileManager = new SafeFolder("安全文件管理器");

        SafeFolder sa = new SafeFolder("sa");
        SafeComponent sb = new SafeFile("sb");
        SafeComponent sc = new SafeFile("sc");

        safeFileManager.add(sa);
        safeFileManager.add(sb);
        safeFileManager.add(sc);

        SafeFolder saa = new SafeFolder("saa");
        SafeComponent sa1 = new SafeFile("sa1");
        sa.add(saa);
        sa.add(sa1);

        SafeFolder saaa = new SafeFolder("saaa");
        SafeComponent saa1 = new SafeFile("saa1");
        saa.add(saaa);
        saa.add(saa1);

        safeFileManager.operate();
    }
}
