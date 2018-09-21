package com.fs.day08.testequals;

public class Test {
    String str1;
    String str2;
    public static void main(String[] args) {
        /*
        基本数据类型== 与equals比较
        * */
        int a = 12;
        int b = 12;
        System.out.println("基本数据类型a==b:"+(a==b));
        //System.out.println(a.euqals(b)); 没有这种方式

        /*
        * 引用数据类型 == 与 equals比较
        * */
        Integer aInteger = 12;
        Integer bInteger = 12;

        Integer a1Integer = new Integer(12);
        Integer b1Integer = new Integer(12);
        System.out.println("引用数据类型aInteger == bInteger:"+(aInteger == bInteger));
        System.out.println("引用数据类型a1Integer == b1Integer:"+(a1Integer == b1Integer));
        System.out.println("引用数据类型a1Integer == 基本数据类型bInteger:"+(a1Integer == bInteger));
        System.out.println("引用数据类型a1Integer.equals(b1Integer):"+(a1Integer.equals( b1Integer)));
        System.out.println("引用数据类型aInteger.equals(b1Integer):"+(aInteger.equals( b1Integer)));

        TestString ts = new TestString();
        TestString ts2 = new TestString();
        System.out.println("String.equals(str2):"+ts.str1.equals(ts2.str2));
        System.out.println("ts.str1 == ts.str2:"+(ts.str1 == ts2.str2 ));
    }
}
