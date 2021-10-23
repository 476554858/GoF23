package com.zjx.chain;

//满减
public class FullMultyDiscount extends MultyDiscount{
    public FullMultyDiscount(MultyDiscount nextMultyDiscount) {
        super(nextMultyDiscount);
    }

    @Override
    public int calculate(int money) {
        if(money > 90){
            System.out.println("优惠满减活动,减10远");
            money = money - 10;
        }

        if(nextMultyDiscount != null){
            return this.nextMultyDiscount.calculate(money);
        }
        return money;
    }
}
