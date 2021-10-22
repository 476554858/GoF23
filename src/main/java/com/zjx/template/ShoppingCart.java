package com.zjx.template;

//模板类
public abstract class ShoppingCart {

    //下单
    public void submitOrder(){
        int money = balance();
        pay(money);
        sendHome();
    }

    //计算金额
    private int balance(){
        System.out.println("计算金额");
        return 100;
    }

    private void sendHome(){
        System.out.println("三公里以内，送货上门");
    }

    //支付金额
    public abstract void pay(int money);

}
