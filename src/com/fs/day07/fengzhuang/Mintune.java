package com.fs.day07.fengzhuang;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Mintune {
    Integer mintune;
    public  String toString(){
        Date date = new Date();
        SimpleDateFormat f = new SimpleDateFormat("mm");
        this.mintune = new Integer(f.format(date));
        String str = Integer.toString(this.mintune);
        return str;
    }
}
