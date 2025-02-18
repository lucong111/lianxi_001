package com.denglu.lianxi3;

import java.util.Random;
import java.util.Scanner;

public class shuangSeQiu {
    public static void main(String[] args) {

        int [] arrRemond = remond_Arr();
        arrBianli(arrRemond);
        // 用户输入7个数字
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];

        // 输入红球
        for (int i = 0; i < arr.length-1; ) {
            System.out.println("输入第"+(i+1)+"个红球数字：");
            int number = sc.nextInt();
            if(number>=1 && number<=33){
                if(panDuan(arr, number)){
                    arr[i]=number;
                    i++;
                }else{
                    System.out.println("该数字已经重复了！");
                }
            }else{
                System.out.println("输入的数字不在1~33范围的整数！");
            }
        }

        // 输入蓝球
        System.out.println("输入蓝球号码：");
        while (true) {
            int blue_number = sc.nextInt();
            if (blue_number>=1 && blue_number<=16) {
                arr[arr.length-1] = blue_number;
                break;
            }else{
                System.out.println("输入的蓝球号码不在1~16范围内！");
            }
        }

        
        int red_zong = 0;
        int blue_zong = 0;
        for (int i = 0; i < arrRemond.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arrRemond[i]==arr[j]) {
                    red_zong++;
                }
            }
        }
        if (arrRemond[arrRemond.length-1]==arr[arr.length-1]) {
            blue_zong++;
        }
        System.out.println("正在打印结果：");
        for (int i = 5000; i > 1; i/=2) { 
            try {
                Thread.sleep(i); 
                } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                }
            
            System.out.print("-");
        }
        System.out.println();
        // System.out.println("红色中奖："+red_zong+"个");
        // System.out.println("蓝色中奖:"+blue_zong+"个");

        if(red_zong==6 && blue_zong==1){
            System.out.println("中1000万");
        }else if(red_zong==6 && blue_zong == 0){
            System.out.println("中500万");
        }else if(red_zong==5 && blue_zong==1){
            System.out.println("中3000元");
        }else if((red_zong==5 && blue_zong==0) || (red_zong==4 && blue_zong==1)){
            System.out.println("中200元");
        }else if((red_zong==4 && blue_zong==0) || red_zong==3 && blue_zong==1){
            System.out.println("中10元");
        }else if ((red_zong==2 && blue_zong==1)||(red_zong==1 && blue_zong==1)||(red_zong==0 && blue_zong==1)){
            System.out.println("中5元");
        }else{
            System.out.println("谢谢惠顾！");
        }

        

        // int [] arrRemond = remond_Arr();
        // arrBianli(arrRemond);

    }

    // 生成中奖号码
    public  static int[] remond_Arr(){
        int[] arr = new int[7];
        Random rd = new Random();
        for (int i = 0; i < arr.length-1;) {
            int number_red = rd.nextInt(33)+1;
            if (panDuan(arr, number_red)) {
                arr[i]=number_red;
                i++;
            }
        }
        int number_blue = rd.nextInt(16)+1;
        arr[arr.length-1]=number_blue;
        return arr;
    }




    // 便利数组
    public static void arrBianli(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    // 看数字中是否已存在该数字
    public static boolean panDuan(int[] arr, int number){
        boolean bool = true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number){
                bool = false;
            }
        }
        return bool;
    }

}
