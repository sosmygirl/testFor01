package com.fs.fun;

public class Test01 {
    //访问权限修饰符public static 表示公共的的静态修饰符 表示在类加载的时候直接加载到内存中去 void表示无返回值
    //参数列表
    // 一个类不能有两个相同的方法签名 （方法名加参数列表）
    static int add(int x){
        //方法体 求1-10的和
        int sum = 0;
        int i = 1;
        for ( i = 1; i <= x ;i++) {
            sum += i;
        }
        return sum;

        //System.out.println("1到"+(i-1)+"的和是"+sum);
    }
    //方法重载 方法名相同，方法列表不同。与返回类型和权限修饰无关。
    //两个整数相加的和
    static int add(int a,int b){
        int sum = 0;
        sum = a + b;
        return sum;
    }
    //可变参数
    static int add(int... b){
        int sum = 0;
        for (double e:b) {
            sum += e;
            
        }
        return sum;
    }
    //main 方法
    public static void main(String[] args) {
        //打印1-10的和
        Test01.add(10);
        System.out.println(Test01.add(10));
        int x =  Test01.add(11);
        System.out.println(x);
        int sum = Test01.add(10,11);
        //打印两个整数的和
        System.out.println(sum);
        //
        sum = Test01.add(1,12,4);
        System.out.println(sum);
    }



}
