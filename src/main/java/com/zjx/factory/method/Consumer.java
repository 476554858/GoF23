package com.zjx.factory.method;

import com.zjx.factory.simple.CarFactory;

public class Consumer {
    public static void main(String[] args) {
        Car car = new WuLingFactory().getCar();
        Car car2 = new TeslaFactory().getCar();

        car.name();
        car2.name();
    }
}
