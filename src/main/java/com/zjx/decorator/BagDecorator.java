package com.zjx.decorator;

//装饰器虚拟类
public class BagDecorator implements Bag{
    private Bag bag; //维持一个堆抽象构件对象的引用

    public BagDecorator(Bag bag) { //注入一个抽象构件类型的对象
        this.bag = bag;
    }

    @Override
    public void pack() {
        bag.pack();
    }
}
