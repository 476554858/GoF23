package com.zjx.bridge;

//抽象的电脑类型
public abstract class Computer {

    //组合，品牌
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void info(){
        brand.info();//自带品牌
    }
}

class Desktop extends Computer{

    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.print("台式机");
    }
}

class Laptop extends Computer{

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.print("笔记本");
    }
}
