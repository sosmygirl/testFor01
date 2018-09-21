package com.fs.day09.instanceoftest;

public class Test01 {
    /*
    * instanceof 数据类型判断
    * */
    public static void main(String[] args) {
        Animal ani = new Dog();
        Dog dog = new Dog();
        Animal animal = new Animal();
        int x = 10;
        if( ani instanceof Dog ){
            System.out.println("true");
        }else System.out.println("false");
    }
}
