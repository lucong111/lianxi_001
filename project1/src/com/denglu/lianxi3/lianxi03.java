package com.denglu.lianxi3;

public class lianxi03 {
    public static void main(String[] args) {
        char[] arr = shengCheng_Arr();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static char[] shengCheng_Arr(){
        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i<=25){
                arr[i]=(char)(97+i);
                // System.out.println(arr[i]);
            }else{
                // char A = 'A';
                // int a = (int)A;
                // System.out.println(a);
                arr[i] = (char)(65+i-26);
            }
        }
        return arr;
    }
}
