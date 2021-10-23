package com.zjx.chain;

//第二次购买优惠
public class SencondMultyDiscount extends MultyDiscount{
    public SencondMultyDiscount(MultyDiscount nextMultyDiscount) {
        super(nextMultyDiscount);
    }

    @Override
    public int calculate(int money) {
        System.out.println("第二次购买，打五折");
        money = Integer.valueOf(money/2);

        if(nextMultyDiscount != null){
            return this.nextMultyDiscount.calculate(money);
        }
        return money;
    }
}
