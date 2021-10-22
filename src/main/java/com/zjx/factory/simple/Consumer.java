package com.zjx.factory.simple;

public class Consumer {
    public static void main(String[] args) {
//        Car wuLing = new WuLing();
//        Car tesla = new Tesla();

        //使用工厂创建
        Car wuLing = CarFactory.getCar("五菱");
        Car tesla = CarFactory.getCar("特斯拉");

        wuLing.name();
        tesla.name();
    }
}
