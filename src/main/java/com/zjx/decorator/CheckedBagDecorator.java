package com.zjx.decorator;

public class CheckedBagDecorator extends BagDecorator{
    public CheckedBagDecorator(Bag bag) {
        super(bag);
    }

    @Override
    public void pack() {
        super.pack(); //调用原有业务方法
        checked(); //打印防伪标识
    }

    //增加防伪标识
    public void checked(){
        System.out.println("===============");
        System.out.println("打上防伪标识");
    }
}
