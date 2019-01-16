package wangchaohu.facadePattern;

/**
 * 空调子系统
 *
 * 打开空调，调节温度
 *
 * 关闭空调
 * */
public class AirconditioningSubsystem {
    //打开空调，调节温度
    public void turnOnTheAC(){
        System.out.println("空调已经打开，温度设置为28℃");
    }

    //关闭空调
    public void turnOffTheAC(){
        System.out.println("空调已经关闭");
    }
}
