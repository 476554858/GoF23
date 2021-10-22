package com.zjx.factory.abstract1;

public class HuaWeiFactory implements IProductFactory{
    @Override
    public IphoneProduct iponeProduct() {
        return new HuWeiIphone();
    }

    @Override
    public IRouterProduct routerProduct() {
        return new HuaWeiRouter();
    }
}
