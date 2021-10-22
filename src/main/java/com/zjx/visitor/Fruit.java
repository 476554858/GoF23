package com.zjx.visitor;

//水果接口
public interface Fruit {
    void draw();
    int price();
    int accept(Visit visit);
}
