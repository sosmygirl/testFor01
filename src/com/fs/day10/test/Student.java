package com.fs.day10.test;

public class Student {
    private String name;
    private int number = 100;
    private Student(){};
    // 定义一个学生类，为成员变量，并用static修饰
    //static Student instance = new Student();
    private static Student instance = new Student();
    public static Student getInstance(){
        return instance;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
