package com.zjx.visitor;

public class Apple implements Fruit{
    private int price = 50;

    @Override
    public void draw() {
        System.out.println("苹果");
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
