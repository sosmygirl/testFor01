package com.fs.day09.interface01;

import com.fs.day09.abstracttest01.Student;
/*
* 1. 接口的使用
* 使用implements 区实现接口 之后必须覆写接口中的方法
* 继承（extends）与实现（implements）同时使用时，extends必须写在前面
* 单继承，多实现
*
* 注意：
* 1. 不仅仅
* */

public class StudentSister extends Student implements Inter01, Inter02 {
    @Override
    public void eat() {

    }

    @Override
    public void play() {

    }

    @Override
    public void look() {

    }

    @Override
    public void work() {

    }
}
