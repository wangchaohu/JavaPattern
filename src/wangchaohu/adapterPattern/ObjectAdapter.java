package wangchaohu.adapterPattern;

/**
 * 这是一个对象适配器类
 *
 * 将typec接口 转接为 3.5mm的接口
 * */
public class ObjectAdapter implements TypeCJack{

    private Jack_35mm jack_35mm;

    //由于我把缺省模式也放在了一起，所以这里也需要实现充电操作
    //这样是不符合对象适配模式的
    @Override
    public void charge() {

    }

    public ObjectAdapter(Jack_35mm jack_35mm){
        this.jack_35mm = jack_35mm;
    }

    @Override
    public void useTypeCPlayMusic() {
        jack_35mm.use3_5playMusic();
    }
}
