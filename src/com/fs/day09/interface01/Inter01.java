package com.fs.day09.interface01;

/*
* 接口
* 1. 接口是什么？
* 是一种规范，也是一种安全的体现
* 2. 语法
* 修饰符 interface 接口名 （接口名与类名命名规则一样）
* 3. 成员常量
* 你定义的变量，默认前面添加 public static final
* 4. 方法
*  全部都是抽象方法，默认前面加了abstract
*
* */
public interface Inter01 {
   // int x = 10;
    public void eat();
    public void play();
    public void look();
    public void work();
}
