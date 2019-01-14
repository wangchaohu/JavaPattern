package wangchaohu.adapterPattern;

/**
 * 这是缺省适配模式
 * 使用抽象类实现TypeC接口的充电功能
 * 当需要使用充电功能的时候，只需要实现这个抽象类
 * 而不必实现原有的TypeC接口
 * */
public abstract class InterfaceAdapter implements TypeCJack {
    @Override
    public void useTypeCPlayMusic() {

    }


    @Override
    public void charge() {

    }
}
