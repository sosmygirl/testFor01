package com.fs.example;

public class JieChan {
    public static void main(String[] args) {
        int x = 0;
        for(int i=3;i<100;i++){
            if(i%3 ==0){
                x++;
                if(x >5){
                    break;
                }else{
                    System.out.println(i);
                }
            }
        }
    }

}
