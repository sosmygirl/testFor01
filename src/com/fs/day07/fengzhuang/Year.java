package com.fs.day07.fengzhuang;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Year {
    Integer year;
   /* public  int  getYear(){
        *//*Date date = new Date();
        SimpleDateFormat f = new SimpleDateFormat("yyyy");
        this.year = new Integer(f.format(date));*//*
        return this.year;
    }*/
    public  String toString(){
        Date date = new Date();
        SimpleDateFormat f = new SimpleDateFormat("yyyy");
        this.year = new Integer(f.format(date));
        String str = Integer.toString(this.year);
        return str;
    }
}
