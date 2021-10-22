package com.zjx.template;

//现金支付
public class CashShopping extends ShoppingCart{
    @Override
    public void pay(int money) {
        System.out.println("现金支付，假一罚十");
    }
}
