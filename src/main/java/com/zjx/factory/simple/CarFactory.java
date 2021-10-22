package com.zjx.factory.simple;

//简单工厂模式
public class CarFactory {
    public static Car getCar(String car){
        if("五菱".equals(car)){
            return new WuLing();
        }else if("特斯拉".equals(car)){
            return new Tesla();
        }
        return null;
    }
}
