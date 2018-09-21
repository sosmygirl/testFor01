package com.fs.day10.test;

public class People {

    private String name;

    //private People 私有化
    private People() {
        System.out.println("调用了构造方法");
    }

    // 静态创建People 对象
    private static People instance = new People();


    //设置getInstance 方法，被外部调用
    public static People getInstance() {
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
