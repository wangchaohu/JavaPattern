package wangchaohu.adapterPattern;

/**
 * 这是一个实体类，表示一个3.5mm插孔的耳机实体
 * */
public class Jack_35mm implements Jack3_5{

    @Override
    public void use3_5playMusic() {
        System.out.println("正在播放出优美的音乐。。。。。。");
    }
}
