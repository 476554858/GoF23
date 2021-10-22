package com.zjx.factory.abstract1;

public class XiaoMiRouter implements IRouterProduct{
    @Override
    public void start() {
        System.out.println("启动小米路由器");
    }

    @Override
    public void shudown() {
        System.out.println("关闭小米路由器");
    }

    @Override
    public void openWife() {
        System.out.println("打开小米wife");
    }

    @Override
    public void setting() {
        System.out.println("小米设置");
    }
}
