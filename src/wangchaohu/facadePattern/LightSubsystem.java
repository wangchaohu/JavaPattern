package wangchaohu.facadePattern;


/**
 * 电灯 子系统
 *
 * 有开关灯操作
 * */
public class LightSubsystem {

    //开灯
    public void turnOnTheLight(){
        System.out.println("电灯已经打开!");
    }

    //关灯
    public void turnOffTheLight(){
        System.out.println("电灯已经关闭!");
    }
}
