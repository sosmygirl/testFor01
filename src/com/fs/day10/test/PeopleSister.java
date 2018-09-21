package com.fs.day10.test;

public class PeopleSister {
    //在类中定义了一个类型为PeopleSister的变量
    private static PeopleSister instance;

    public static PeopleSister getInstance(){
        if (instance == null){
            instance = new PeopleSister();
        }
        return instance;
    }
    //private PoepleSister
    private PeopleSister(){}
}
