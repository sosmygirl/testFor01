package com.fs.myclass;
/*
* 享元模式
* */
public class TestXiangYuan {
    public static void main(String[] args) {
        String s2 = "1234567";//s1 和s2 引用的同一个地址
        String s1 = "1234567";
        String s3 = new String("112") ;//s3 和s4 分配不同的内存空间，拥有不同的引用
        String s4  = new String("112");
        //包装类的享元模式的范围-127-128，是内存中预设的独立空间，不用开辟新的内存空间存值 ，内存共享同一个数据
        Integer aInteger1  = 121;
        Integer aInteger2 = 121;
        //== 比较两个基本数据类型的值是否相等
        if (s1 == s2){
            System.out.println("s1==s2");
        }else
        System.out.println("s1!=s2");

        //equals 比较两个引用类型值是否相等
        if (s3.equals(s4)){
            System.out.println("equls相等");

        }else System.out.println("equls不相等");


        if (aInteger1 == aInteger2){
            System.out.println("== 相等");
        }else if (aInteger1.equals(aInteger2)){
            System.out.println("equals相等2");
        }

    }


}
