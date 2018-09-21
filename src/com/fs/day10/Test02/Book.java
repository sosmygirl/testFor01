package com.fs.day10.Test02;

public class Book {
    //私有化的引用类型成员变量
    private static Book instance;

    public static Book getInstance(){
        if (instance == null){
            instance = new Book();
        }return instance;
    }

    private Book(){};
}
