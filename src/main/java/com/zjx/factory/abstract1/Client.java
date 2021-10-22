package com.zjx.factory.abstract1;

public class Client {
    public static void main(String[] args) {
        System.out.println("======小米产品========");
        //小米工厂
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        IphoneProduct iphoneProduct = xiaomiFactory.iponeProduct();
        iphoneProduct.callup();
        iphoneProduct.sendMS();

        IRouterProduct routerProduct = xiaomiFactory.routerProduct();
        routerProduct.openWife();

        System.out.println("======华为产品========");
        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
        iphoneProduct = huaWeiFactory.iponeProduct();
        iphoneProduct.callup();
        iphoneProduct.sendMS();

        routerProduct = huaWeiFactory.routerProduct();
        routerProduct.openWife();
    }
}
