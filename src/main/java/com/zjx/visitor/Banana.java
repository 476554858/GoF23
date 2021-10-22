package com.zjx.visitor;

public class Banana implements Fruit{
    private int price = 30;

    @Override
    public void draw() {
        System.out.println("香蕉");
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public int accept(Visit visit) {
        return visit.sell(this);
    }
}
