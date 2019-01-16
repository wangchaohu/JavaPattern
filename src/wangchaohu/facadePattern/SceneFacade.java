package wangchaohu.facadePattern;


/**
 * 门面类
 *
 * 提供回家、出门场景方案
 *
 * 将子系统的方法集中在这个门面类中
 * */
public class SceneFacade {
    private LightSubsystem lightSubsystem = null;
    private TvSubsystem tvSubsystem = null;
    private AirconditioningSubsystem airconditioningSubsystem = null;

    public SceneFacade(){
        this.lightSubsystem = new LightSubsystem();
        this.tvSubsystem = new TvSubsystem();
        this.airconditioningSubsystem = new AirconditioningSubsystem();
    }

    //回家
    public void goHome(){
        System.out.println("------------回家------------");
        this.lightSubsystem.turnOnTheLight();
        this.tvSubsystem.turnOnTheTv();
        this.airconditioningSubsystem.turnOnTheAC();
    }

    //出门
    public void goOut(){
        System.out.println("------------出门------------");
        this.lightSubsystem.turnOffTheLight();
        this.tvSubsystem.turnOffTheTv();
        this.airconditioningSubsystem.turnOffTheAC();
    }
}
