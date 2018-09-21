package com.fs.day10.test;

public class Test {
    public static void main(String[] args) {
        //People lx = People.getInstance();
        PeopleSister lx  = PeopleSister.getInstance();
        PeopleSister lm  = PeopleSister.getInstance();
        if (lx == lm){
            System.out.println("同一个");
        }

    }
}
