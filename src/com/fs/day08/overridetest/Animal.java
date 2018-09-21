package com.fs.day08.overridetest;
/*
*  鸟（Bird）和狼（Wolf）都是动物（Animal），动物都有心跳（beat()），会呼吸（beat()），
*  但是鸟会fly（fly()），狼会奔跑（run()），用java程序实现以上描述(使用继承来实现);
*
*  */
public class Animal {
    public  void bite(){
        System.out.println("can bite...");
    }
    public void breath(){
        System.out.println("can breat...");
    }
}
