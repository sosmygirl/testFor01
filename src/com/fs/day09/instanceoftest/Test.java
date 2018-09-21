package com.fs.day09.instanceoftest;

public class Test {
    public static void main(String[] args) {
        Animal ani = new Dog();
        //ani.eat(); Animal中没有eat()方法
        Dog dog = (Dog)ani;
        dog.eat();
    }

}
