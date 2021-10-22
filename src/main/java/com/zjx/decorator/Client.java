package com.zjx.decorator;

public class Client {

    public static void main(String[] args) {
        Bag bag = new BagImpl();

        //增加防伪标志
        bag = new CheckedBagDecorator(bag);
        //加急配送
        bag = new SpeedDecorator(bag);
        bag.pack();
    }
}
