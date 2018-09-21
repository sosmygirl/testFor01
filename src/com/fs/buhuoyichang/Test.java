package com.fs.buhuoyichang;

public class Test {
    public void div(int a, int b) {
        int c = 0;
        /*try {//捕获异常
            c = a / b;//可能发生异常

        } catch (ArithmeticException e) {//处理异常 catch 越往后级别越大
            System.out.println("除数不能为0");
            b = 1;
            c = a / b;
        } finally {//无论try执行还是catch执行都会执行finally,可以做一些收尾，或清理的工作
            System.out.println("c= " + c);
        }*/
        try {
            c =a/b;

        }catch (ArithmeticException e){




    }catch (Exception e1){

        }
        }

    public static void main(String[] args) {
        Test t = new Test();
        t.div(10, 0);

    }
}
