package com.denglu.lianxi3;

import java.util.Scanner;

import com.denglu.lianxi2.lianxi02;

// import com.denglu.lianxi2.lianxi02;

public class shuzu_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入数组长度：");
        int number = sc.nextInt();

        int[] arr = lianxi02.printArr(number);

        System.out.print("原数组为：");
        for (int i = 0; i < arr.length; i++) {
            if(i!=arr.length-1){
                System.out.print(arr[i]+" ");
            }else{
                System.out.println(arr[i]);
            }                
        }

        int arrnumber = shuzuString(arr);
        System.out.println(arrnumber);
    }

    public static int shuzuString(int[] arr){
        int number = arr[0];
        for (int i = 1; i < arr.length; i++) {
            number = number*10+arr[i];
            System.out.println("第"+i+"次："+number);
        }
        return number;
    }
}
