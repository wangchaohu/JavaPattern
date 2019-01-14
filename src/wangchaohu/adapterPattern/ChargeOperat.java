package wangchaohu.adapterPattern;

/**
 * 实现充电操作
 * 只需要继承缺省实现的适配器
 * 而不需要实现原有接口
 * */
class ChargeOperat extends InterfaceAdapter {

    @Override
    public void charge() {
        System.out.println("正在进行充电操作。。。。。。");
    }
}
