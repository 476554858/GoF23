package com.zjx.visitor;

public class Orange implements Fruit{
    private int price = 20;

    @Override
    public void draw() {
        System.out.println("橘子");
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
