package com.fs.day07;
/*
* Rectangle 矩形类
* */
public class Rectangle {
    //矩形的长
    int length;
    //矩形的宽
    int width;
    //矩形的周长
    int perimeter;
    //矩形的面积
    int area;
    //get长方形的面积
    public  int getArea(int length, int width){
        area = length*width;
        return area;
    }
}
