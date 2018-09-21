package com.fs.day07.fengzhuang;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EnDate {
    Integer year;
    Integer month;
    Integer day;
    Integer hrs;
    Integer minute;
    Integer second;

    //使用SimpleDateFormat工具将时间单独提取出来
    public Integer getYear(){
        Date date = new Date();
        SimpleDateFormat f = new SimpleDateFormat("yyyy");
        this.year = new Integer(f.format(date));
        return this.year;
    }

    public Integer getMonth(){
        Date date = new Date();
        SimpleDateFormat f = new SimpleDateFormat("MM");
        this.month = new Integer(f.format(date));
        return this.month;
    }
    public Integer getDay(){
        Date date = new Date();
        SimpleDateFormat f = new SimpleDateFormat("dd");
        this.day = new Integer(f.format(date));
        return this.day;
    }
    public Integer getHrs(){
        Date date = new Date();
        SimpleDateFormat f = new SimpleDateFormat("hh");
        this.hrs = new Integer(f.format(date));
        return this.hrs;
    }
    public Integer getMinute(){
        Date date = new Date();
        SimpleDateFormat f = new SimpleDateFormat("mm");
        this.minute = new Integer(f.format(date));
        return this.minute;
    }
    public Integer getSecond(){
        Date date = new Date();
        SimpleDateFormat f = new SimpleDateFormat("ss");
        this.second = new Integer(f.format(date));
        return this.second;
    }

}
