package com.zjx.builder.demo02;

public class Test {
    public static void main(String[] args) {
        //服务员
        Worker worker = new Worker();
        //链式编程
        Product product = worker.builderA("全家桶").builderB("雪碧")
                .getProduct();
        System.out.println(product.toString());
    }
}
