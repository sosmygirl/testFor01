package com.fs.day07.school;

public class School {
    //成员变量
    private  String name;
    private String location;
    private int   number;
    private double area;
    private long contact;

    //成员方法
    public void getNumber(){

    }
    /*
     构造方法
     1.如果没写，默认自带一个公共无参构造方法
     2.如果定义了一个构造方法，默认无参构造方法就被覆盖了
     3.构造方法就是来创建对象
     4.写类的时候习惯创建一个无参构造方法
     * */
    School(){

    }
    School(String name){

    }
    School(String name, String location, int  number, double area, long contact){
        this.name = name;
        this.location = location;
        this.number = number;
        this.area = area;
        this.contact = contact;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }
}
