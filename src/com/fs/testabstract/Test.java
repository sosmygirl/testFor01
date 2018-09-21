package com.fs.testabstract;

public class Test {
    public static void main(String[] args) {
        new Dog().eat();
//        new Cat().eat(); 抽象类不能new对象，即便重写了eat方法，还是继续抽象
    }
}
