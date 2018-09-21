package com.fs.day09.interface02;
/*
*接口也可以使用多态的语法
* 不论是单接口还是多借口
*
* */
public class Music {
    public static void main(String[] args) {
        Brass piano = new Brass();
        piano.play();
    }
}
