package com.denglu.lianxi2;

import java.util.Scanner;

public class lianxi02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入数组长度：");
        int number = sc.nextInt();
        System.out.println(svg(printArr(number)));
    }


    public static double svg(int[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        double avg = sum/arr.length;
        return avg;
    }

    public static int[] printArr(int a){
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("输入第"+(i+1)+"个数：");
            int number = sc.nextInt();
            arr[i]=number;
        }
        return arr;
    }
}
