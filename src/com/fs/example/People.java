package com.fs.example;

public class People {
    int leg;
    int hand;
    String name;
    //People默认构造方法

    public People(String s) {
        this.name = s ;
        this.init();
    }
    void init(){
        this.leg = 2;
        this.hand = 2;
        System.out.println(name+"有"+leg+"条腿，"+hand+"支手。");
    }

    public static void main(String[] args) {
        People boshi =new People("布什");
    }
}
