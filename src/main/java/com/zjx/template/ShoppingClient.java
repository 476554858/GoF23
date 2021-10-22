package com.zjx.template;

public class ShoppingClient {
    public static void main(String[] args) {
        //现金支付
        ShoppingCart cart = new CashShopping();
        cart.submitOrder();
        //微信支付
        ShoppingCart cart1 = new OnlineShopping();
        cart1.submitOrder();
    }
}
