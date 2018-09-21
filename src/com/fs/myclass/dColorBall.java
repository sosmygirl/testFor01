package com.fs.myclass;

import java.util.Random;


public class dColorBall {
    static int[] num = new int[7];
    static boolean rep = true;
    static Random r = new Random();

    public static void test() {
        for (int i = 0; i < num.length - 1; i++) {
            num[i] = r.nextInt(33) + 1;
            for (int j = 0; j < i; j++) {
                if (num[i] == num[j]) {
                    i--;
                }
            }
        }
        num[6] = r.nextInt(16) + 1;
        System.out.print("红色球：");
        for (int i = 0; i < num.length - 1; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println("蓝色球："+num[6]);
    }


    public static void main(String[] args) {
        dColorBall.test();
    }
}
