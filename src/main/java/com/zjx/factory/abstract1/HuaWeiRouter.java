package com.zjx.factory.abstract1;

public class HuaWeiRouter implements IRouterProduct{
    @Override
    public void start() {
        System.out.println("启动华为路由器");
    }

    @Override
    public void shudown() {
        System.out.println("关闭华为路由器");
    }

    @Override
    public void openWife() {
        System.out.println("打开华为wife");
    }

    @Override
    public void setting() {
        System.out.println("华为设置");
    }
}
