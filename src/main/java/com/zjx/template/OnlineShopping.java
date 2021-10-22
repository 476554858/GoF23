package com.zjx.template;

//微信支付
public class OnlineShopping extends ShoppingCart{
    @Override
    public void pay(int money) {
        System.out.println("微信支付，减免五元，请支付：" + (money - 5) + "元");
    }
}
