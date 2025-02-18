package com.denglu.lianxi;

import java.util.Scanner;

public class lianxi01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入数字：");
        int number = sc.nextInt();
        xiangCheng(number);
    }
public static void xiangCheng(int num){
    for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= i; j++) {
            int arr = i * j;
            System.out.print(j+"*"+i+"="+arr+"\t");
        }
        System.out.println();
    }
}


}

