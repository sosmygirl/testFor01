package com.fs.day07.fengzhuang;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Month {
    Integer month;
    public  String toString(){
        Date date = new Date();
        SimpleDateFormat f = new SimpleDateFormat("MM");
        this.month = new Integer(f.format(date));
        String str = Integer.toString(this.month);
        return str;
    }
}
