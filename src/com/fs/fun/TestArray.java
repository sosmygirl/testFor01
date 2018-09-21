package com.fs.fun;
/*
* 数组
* 创建数组
* 类型[] 变量名 = new 类型[array的长度];
* 可以放多个元素的容器
*
* */
public class TestArray {
    //动态
    int[] array = {};
    int[] array1 = new int[4];
    //静态
    double[] array2 = {1,2,4,4.3};
    String[] str = {"12","english","中文"};

    //二维数组
    int[][] ar = {{12,12,12,12},{1,2,4},{3,5,7,4}};
    //动态创建
    int[][] ar2 = new int[3][];

    //三维数组
    int[][][] array3 = {{{1,2},{3,4},{5,6}}};

    //数组排序
    int[] array4 = {2,10,5,7,30,9,12,0};




    public static void main(String[] args) {
        TestArray testArray = new TestArray();
        //遍历一维数组
        for (int i = 0; i < 3 ; i++) {
            System.out.println(testArray.str[i]);
        }
        //遍历二维数组
        System.out.println("二维数组的遍历");
        for (int i = 0; i < testArray.ar.length ; i++) {
            for (int j = 0; j <testArray.ar[i].length ; j++) {
                System.out.print(testArray.ar[i][j]+"\t");

            }
            System.out.println("\n");
        }
        //二维数组排序
        for (int j = 0; j <testArray.array4.length; j++) {
            for (int i = 0; i <testArray.array4.length ; i++) {
                if (i+1>=testArray.array4.length){
                    break;
                }
                if (testArray.array4[i]>testArray.array4[i+1]){
                    int c = testArray.array4[i];
                    testArray.array4[i] = testArray.array4[i+1];
                    testArray.array4[i+1] = c;


                }

            }
            System.out.print(testArray.array4[j]+"\t");
            System.out.println(testArray.array4[0]);

        }
        //可变参数


    }
}

