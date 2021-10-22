package com.zjx.decorator;

public class SpeedDecorator extends BagDecorator{
    public SpeedDecorator(Bag bag) {
        super(bag);
    }

    @Override
    public void pack() {
        super.pack(); //调用原有业务方法
        speedy();
    }

    //快件加急
    public void speedy(){
        System.out.println("============");
        System.out.println("快递大哥，请加急邮送");
    }
}
