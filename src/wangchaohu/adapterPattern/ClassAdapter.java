package wangchaohu.adapterPattern;


/**
 * 这是一个类适配器类
 *
 * 将typec接口 转接为 3.5mm的接口
 * */
public class ClassAdapter extends Jack_35mm implements TypeCJack{

    //由于我把缺省模式也放在了一起，所以这里也需要实现充电操作
    //这样是不符合类适配模式的
    @Override
    public void charge() {

    }

    @Override
    public void useTypeCPlayMusic() {
        use3_5playMusic();
    }
}
