package com.zjx.strategy;

//第二次购买优惠
public class SecondDiscount implements Discount{
    @Override
    public int calculate(int money) {
        System.out.println("第二次购买优惠，打九折");
        Double balance = money * 0.9;
        return balance.intValue();
    }
}
