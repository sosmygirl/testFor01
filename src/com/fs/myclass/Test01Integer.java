package com.fs.myclass;

public class Test01Integer {


/*
    //String s = "wo";
    Integer a = new Integer("12");
    //Integer aInteger = new Integer("dddd");//java.lang.NumberFormatException 数据转换异常
    Byte b= new Byte("123");
    Character character  = new Character('1');
    Short aShort  = new Short("12");
    Float aFloat =new Float("12.9");
    Long aLong = new Long("123456");
    Double aDouble = new Double("12.45");
*/

    public static void main(String[] args) {


 /*       Test01Integer  test01Integer = new Test01Integer();
        System.out.println(test01Integer.a);*/


        //JDK< 1.5
        Integer a1 = new Integer(10);
        Integer a2 = new Integer(10);


        // 将封装型的数据转换为 基本数据类型 --自动拆箱
        int a11 = new Integer(10);
        int a22 = new Integer(10);

        // JDK >1.5  基本数据类型的值转化为封装类型 --自动装箱
        Integer m1 = 20;
        Integer m2  = 20;
        // boolean,byte,char(\u0000~\u007F),byte(-128~127)范围内才能自动封装 --享元设计模式 （在内存空间预设-128~127）
        Integer n1 = 128;
        Integer n2  = 128;
        // 自动拆无限制
        int k1 = new Integer(128);
        int k2  = new Integer(128);

        System.out.println(a1==a2);//flase
        System.out.println(a11==a22);//true
        System.out.println(m1 == m2);//true
        System.out.println(n1 == n2);//flase
        System.out.println(k1 == k2);//true
    }
}
