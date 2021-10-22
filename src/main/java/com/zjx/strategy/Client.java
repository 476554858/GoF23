package com.zjx.strategy;

public class Client {

    public static void main(String[] args) {
        OtherPayShopping shopping = new OtherPayShopping();
//        shopping.setDiscount(new NewerDiscount());
        //使用不同的策略类
        shopping.setDiscount(new SecondDiscount());
        shopping.submitOrder();
    }
}
