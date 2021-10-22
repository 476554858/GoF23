package com.zjx.factory.abstract1;

public class HuWeiIphone implements IphoneProduct{
    @Override
    public void start() {
        System.out.println("开启华为手机");
    }

    @Override
    public void shudown() {
        System.out.println("关闭华为手机");
    }

    @Override
    public void callup() {
        System.out.println("华为手机打电话");
    }

    @Override
    public void sendMS() {
        System.out.println("华为手机发短信");
    }
}
