package com.zjx.chain;

public class Client {
    //初始化满减优惠券
    private static MultyDiscount multyDiscount = new SencondMultyDiscount(null);
    static {
        multyDiscount = new FullMultyDiscount(multyDiscount);
    }
    public static void main(String[] args) {
        int money = multyDiscount.calculate(100);
        System.out.println("优惠后价格：" + money);
    }
}
