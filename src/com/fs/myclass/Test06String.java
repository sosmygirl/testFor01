package com.fs.myclass;
/*
String / StringBuffer/StringBuilder 的区别
1.String 与StringBuffer/StringBuffer相比，拼接效率低 为什么？
2.String 底层是通过StringBUILDER实现的，在使用 + 拼接符时，String会转化为StringBuilder来拼接
3.String可以动态创建，StringBuffer/StringBuilder 不能动态创建
4.String和StringBuilder是线程安全的，StringBuffer是线程不安全的
5.string他的对象一旦被创建那么值和长度就固定不变
* */

public class Test06String {
    public static void main(String[] args) {
        String s1 = "在教室学习";
        String s2 =new String( "在教室唱歌");
        //空字符串
        String s3 = "";
        String s4 = null;
        String s5 = new String();
        System.out.println(s3==s4);
        System.out.println(s4 == s5);
        System.out.println(s3.equals(s4));
        System.out.println(s3.equals(s5));

        //StringBuffer 和StringBuilder 不能使用静态初始化
        StringBuffer sb01 = new StringBuffer("stringbuffer");
        StringBuilder sbl = new StringBuilder("stringbuilder");

        /*
        * 效率测试
        * 1。string 10000
        *
        * */
        String str  = "1";
       /*
         /效率低
        for (int i = 0; i <1000000 ; i++) {
            str += i;
        }
        System.out.println("success");*/

       //效率高
        for (int i = 0; i < 10000000; i++) {
            sb01.append(i);
            sbl.append(i);
        }
        System.out.println("success");
        System.out.println();
    }
}
