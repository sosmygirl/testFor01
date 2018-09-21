package com.fs.day07.fengzhuang;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Hours {
    Integer hours;
    public  String toString(){
        Date date = new Date();
        SimpleDateFormat f = new SimpleDateFormat("hh");
        this.hours = new Integer(f.format(date));
        String str = Integer.toString(this.hours);
        return str;
    }
}
