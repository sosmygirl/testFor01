package com.fs.myclass;

import com.fs.fun.Test01;

import java.util.Random;

public class Test07Math {
    public static void main(String[] args) {
       double random =  Math.random();
        //System.out.println(random);//拿到0-1的随机小数

        double random01 = Math.random();
        int intRandom = (int)(random01*100+1);//0~n拿到m~n
       // System.out.println(intRandom);

        Random r  = new Random();
        int int10 =  r.nextInt(10);//随机一个nextInt(n)-[0-n)的值
        int int33 =  r.nextInt(33);
        System.out.println(int33+1);
        System.out.println(int10);

    }
}
