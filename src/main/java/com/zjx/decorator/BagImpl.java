package com.zjx.decorator;

public class BagImpl implements Bag{
    @Override
    public void pack() {
        System.out.println("包装苹果");
    }
}
