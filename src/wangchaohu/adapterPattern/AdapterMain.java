package wangchaohu.adapterPattern;

/**
 * Java适配器模式 事例代码
 *
 * 这是Adapter模式的入口类
 *
 * 现在要实现的是将Typec接口的耳机插孔通过3.5mm的耳机放出音乐
 *
 * 这里就需要一个转接线，将typec接口转接为3.5mm的接口，然后3.5mm的耳机就可以正常使用了
 * */
public class AdapterMain {


    public static void main(String[] args){

        //对象适配器
        Jack_35mm jack_35mm = new Jack_35mm();
        ObjectAdapter objectAdapter = new ObjectAdapter(jack_35mm);
        objectAdapter.useTypeCPlayMusic();

        //类适配模式
        ClassAdapter classAdapter = new ClassAdapter();
        classAdapter.useTypeCPlayMusic();

        //缺省适配模式
        ChargeOperat chargeOperat = new ChargeOperat();
        chargeOperat.charge();

    }
}
