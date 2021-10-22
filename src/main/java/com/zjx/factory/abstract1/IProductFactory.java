package com.zjx.factory.abstract1;

/**
 * 抽象工厂
 */
public interface IProductFactory {

    //生产手机
    IphoneProduct iponeProduct();

    //生产路由器
    IRouterProduct routerProduct();

}
