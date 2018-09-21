package com.fs.day09.upcasting02;


public class Feed {
    public static void getfood(Dog d){
        d.eat();
    }
    public static void main(String[] args) {
        JinMao jinmao = new JinMao();
        Feed.getfood(jinmao);
        Dog hashiqi = new HaShiQi();
        getfood(hashiqi);
        Dog zangao = new ZangAo();
        getfood(zangao);
        //通过人类来选择
        Person p = new Person();
        p.food(jinmao);
        hashiqi.eat();
    }
}
