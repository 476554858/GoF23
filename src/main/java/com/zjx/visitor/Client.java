package com.zjx.visitor;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<Fruit>();
        fruits.add(new Apple());
        fruits.add(new Banana());
        fruits.add(new Orange());
        Visit visit = new Visit();

        int total = 0;
        for(Fruit fruit : fruits){
            total = total + fruit.accept(visit);
        }
        System.out.println("水果总价格：" +  total);
    }
}
