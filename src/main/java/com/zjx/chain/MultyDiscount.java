package com.zjx.chain;

/**
 * 责任链类父类
 */
public abstract class MultyDiscount implements Discount{
    protected MultyDiscount nextMultyDiscount;

    public MultyDiscount(MultyDiscount nextMultyDiscount) {
        this.nextMultyDiscount = nextMultyDiscount;
    }

    public abstract int calculate(int money);
}
