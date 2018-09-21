package com.fs.myclass;

public class Trans {

    public static void main(String[] args) {

        int int100 =new Integer(100);//Integer-->int
        Integer i = int100;//int -->Integer
        String x  = String.valueOf(int100);// int--> String

        //int ints = Integer.valueOf(x).intValue();   //String-->int
        int ints = Integer.parseInt(x); //String-->int
        Integer int2 = new Integer(x); //String --> Integer

        //String str100 = i.toString();//Integer-->String
        //String str100 = String.valueOf(i);//Integer-->String
        String str100 = Integer.toString(i);//Integer-->String


        System.out.println(x);
        System.out.println(ints);
        System.out.println(int2);
        System.out.println(str100);


    }
}
