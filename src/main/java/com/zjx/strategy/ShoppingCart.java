package com.zjx.strategy;

//模板类
public abstract class ShoppingCart {

    private Discount discount;

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    //下单
    public void submitOrder(){
        int money = balance();
        money = discount.calculate(money);
        System.out.println("优惠后减免:" + money);
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


}
