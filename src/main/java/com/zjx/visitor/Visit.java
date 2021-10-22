package com.zjx.visitor;

//访问者类
public class Visit {

    //苹果计价
    public int sell(Apple apple){
        System.out.println("apple's price:50");
        return apple.price();
    }

    //橘子的价格
    public int sell(Orange orange){
        System.out.println("orage's price: 20");
        return orange.price();
    }

    //香蕉的价格
    public int sell(Banana banana){
        System.out.println("banana's price:30");
        return banana.price();
    }

    //其他水果价格
    public int sell(Fruit fruit){
        System.out.println("other's price: 10");
        return 10;
    }

}
