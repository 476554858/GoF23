package com.zjx.prototype.demo2;

import java.util.Date;

/**
 * 客户端：克隆
 */
public class Bilibli {
    public static void main(String[] args) throws CloneNotSupportedException {
        //原型对象 v1
        Date date = new Date();
        Video v1 = new Video("小张视频", date);
        Video v2 = (Video) v1.clone();
        System.out.println("v1=>" + v1);
        System.out.println("v2=>" + v2);
        System.out.println("============");
        date.setTime(12333333333l);
        System.out.println("v1=>" + v1);
        System.out.println("v2=>" + v2);

    }
}
/**
 *        //v1 克隆 v2
 *
 *         System.out.println("v2=>" + v2);
 *         System.out.println("v2=>hash:" + v2.hashCode());
 *
 *         v2.setName("克隆小张");
 *         System.out.println(v2);
 */
