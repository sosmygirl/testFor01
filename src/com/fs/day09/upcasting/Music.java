package com.fs.day09.upcasting;
/*
* 多态
* 1. 左边写父类 ，右边写子类 真实类型是子类 父类类型 变量名= new 子类类型
* 2. 注意：子类必须覆写父类的方法，才能实现多态
* 3. 实现不同子类之间的差异
* 4. 编译看左边 运行看右边
* */
public class Music {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }
    public static void main(String[] args) {
        Wind flute  = new Wind();//子类没有覆写方法
        Brass violin = new Brass();
        tune(flute);
        tune(violin);
    }
}
