package com.fs.day08.overridetest;

public class Test {
    public static void main(String[] args) {
        Bird eagle =new Bird();
        eagle.fly();
        eagle.bite();
        eagle.breath();

        Student st1 = new Student();

        // 给学生set 名字
        st1.setName("王多多");
        st1.setAge(20);
        //打印某学生信息
        System.out.println("姓名："+st1.getName()+",年龄："+st1.getAge());
    }
}
