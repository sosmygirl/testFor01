package com.fs.day07.fengzhuang;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Second {
    Integer second;
    public  String toString(){
        Date date = new Date();
        SimpleDateFormat f = new SimpleDateFormat("ss");
        this.second = new Integer(f.format(date));
        String str = Integer.toString(this.second);
        return str;
    }
}
