package com.fs.day07.fengzhuang;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Day {
    Integer day;
    public  String toString(){
        Date date = new Date();
        SimpleDateFormat f = new SimpleDateFormat("dd");
        this.day = new Integer(f.format(date));
        String str = Integer.toString(this.day);
        return str;
    }
}
