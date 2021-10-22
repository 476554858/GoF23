package com.zjx.strategy;

//新用户购买优惠
public class NewerDiscount implements Discount{
    @Override
    public int calculate(int money) {
        System.out.println("新用户购买优惠，打七折");
        Double balance = money * 0.7;
        return balance.intValue();
    }
}
