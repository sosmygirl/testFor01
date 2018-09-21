package com.fs.fun;

public class HWork {
    //定义一个方法getMax,接收两个int参数,返回最大的一个数
   /* public static int  getMax(int a,int b){
       int max = 0;
       if (a>b){
           max = a;
       }else
           max = b;
        return max;
    }
    public static void main(String[] args) {
        int max = HWork.getMax(12,1);
        System.out.println(max);
    }*/
    //定义一个方法,接收三个int参数,返回最小的一个数
   /* public static int min(int a, int b, int c){
        int min = 0;
        if(a<b&&a<c){
            min = a;
        }else if(a<b&&c<a){
            min = c;
        }else min = b;
        return min;
    }

    public static void main(String[] args) {
        int min = HWork.min(116,11,16);
        System.out.println(min);*//*
 }*/
    //设计一个求多个整数积的方法
/*
    public static int product(int... a){
        int pro = 1;
        for (int e:a) {

            pro *=e;

        }
        return  pro;
    }

    public static void main(String[] args) {
        System.out.println(HWork.product(1,2,3));
    }
*/

    //4.设计一个方法，查询并返回一个字符在字符数组中第一次出现的位置
/*    public static int searchCharFisrtIndex(char ch,char[] chars){
        int ch_index = 0;
        for(int i= 0;i<chars.length;i++){
            if (chars[i]==ch){
                 ch_index = i;
                 break;
            }
        }


        return ch_index;
    }

    public static void main(String[] args) {
       // HWork hWork = new HWork() ;
        char[] chars = {'a','b','d','e','b'};
        int in = HWork.searchCharFisrtIndex('b',chars);
        System.out.println(in);
    }*/

    //5.设计一个方法,统计一个字符在字符数组中出现的次数
  /*  public static int getFruq(char ch, char[] charArray){
        int n = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i]==ch){
                n++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        char[] charArray = {'1','4','a','e','a'};
        int number = getFruq('a',charArray);
        System.out.println(number);
    }
*/

    //已知这样的整形数组  int[] arr = {1,2,3,4,5,6,7,8,9,11,12}计算出其中的奇数和
    /*public static int plus(int[] arr){
        int sum =0 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 !=0){
                sum += arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,11,12};
        int sum = HWork.plus(arr);
        System.out.println(sum);

    }*/

    //7.现在有数组 double[] scores = {11,34,76,77,88,99,58,97,56}；
    // 定义一个方法统计并打印出每一个阶段学生人数(分段方式：0-60;60-80;80-100)
   /* public static void studentLevl(double[] scores){
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i]<=100&&scores[i] >=80){
                a++;
            }else if(scores[i]< 80&&scores[i] >=60){
                b++;
            }else c++;
        }
        System.out.println("0-60人数："+a+"\n"+"60-80人数："+b+"\n"+"80-100："+c);
    }
    public static void main(String[] args) {
        double[] scores = {11,34,76,77,88,99,58,97,56};
        HWork.studentLevl(scores);
    }*/
   //8.设计一个方法，传入一个int的数组，返回该数组中最大的值
/*    public static int getMax(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i+1==arr.length){
                break;
            }
            if (arr[i]>arr[i+1]){
                max  = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = max;
            }
        }
        return max;//arr[arr.length-1];98+6+看j
    }

    public static void main(String[] args) {
        int[] arr = {89,4,6,85,47,97,100,12,0};
        int maxNumber = HWork.getMax(arr);
        System.out.println(maxNumber);
    }*/
   //设计一个方法，传入一个int的数组，返回该数组中最小的值
     public static int getMin(int[] arr){
        int min = 0;
         for (int j = 0; j < arr.length; j++) {
             for (int i = 0; i < arr.length; i++) {
                 if(i+1==arr.length){
                     break;
                 }
                 if (arr[i]>arr[i+1]){
                     min  = arr[i+1];
                     arr[i+1] = arr[i];
                     arr[i] = min;
                 }
             }

         }
        return arr[0];
    }

    public static void main(String[] args) {
        int[] arr = {6,4,6,85
                ,47,97,100,1};
        int minNumber = HWork.getMin(arr);
        System.out.println(minNumber);
    }


}



