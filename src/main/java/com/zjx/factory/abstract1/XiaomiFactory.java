package com.zjx.factory.abstract1;

public class XiaomiFactory implements IProductFactory{
    @Override
    public IphoneProduct iponeProduct() {
        return new XiaoMiIphone();
    }

    @Override
    public IRouterProduct routerProduct() {
        return new XiaoMiRouter();
    }
}
