package wangchaohu.facadePattern;

/**
 * 门面模式主入口类
 *
 * 这里我们以智能家居回家、出门场景为例
 * 子系统有：开灯、打开电视、打开空调
 * */
public class FacadePatternMain {
    public static void main(String[] args){
        SceneFacade sceneFacade = new SceneFacade();

        //回家
        sceneFacade.goHome();
        //出门
        sceneFacade.goOut();
    }
}
