package com.fs.testabstract;
/*
*抽象类Animal
*
* */
public abstract class Animal {
    //抽象方法eat
    public abstract void eat();
    //抽象方法 speak
    public abstract void speak();
}

//普通类 继承 抽象类：必须重写（实现）抽象类中的所有抽象方法
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("eat bone");
    }
    @Override
    public void  speak(){
        System.out.println("wangwangwang");
    }
}
//抽象类继承抽象类： 只要一个类在继承抽象类时，有抽象方法没有没有重写，那么这个子类就接着抽象
abstract class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("eat fish");
    }
}

