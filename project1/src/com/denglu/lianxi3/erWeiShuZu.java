package com.denglu.lianxi3;

import java.util.Scanner;

public class erWeiShuZu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入行数：");
        int n = sc.nextInt();
        int[][] arrarr = new int[n][n];
        for (int i = 0; i < arrarr.length; i++) {
            arrarr[i][0]=1;
            arrarr[i][i]=1;
            if (i>=2){
                System.out.println(i);
                // i=2 
                for (int j = 1; j < i; j++) {
                    arrarr[i][j]=arrarr[i-1][j-1]+arrarr[i-1][j];
                }
            }
        }
        arrarrBianLi(arrarr);
    }







    // 便利二维数组
    public static void arrarrBianLi(int[][] arrarr){
        for (int i = 0; i < arrarr.length; i++) {
            for (int j = 0; j < arrarr[i].length; j++) {
                System.out.print(arrarr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
