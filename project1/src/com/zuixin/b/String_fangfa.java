package com.zuixin.b;

import java.util.Scanner;
import java.util.StringJoiner;

public class String_fangfa {
    public static void main(String[] args) {
        // String str = "abcdajdaihahahsdhadshuf";
        // String str1 = "abcdaJdaihAhahsdhadshuf";
        // System.out.println(str);

        // boolean bool1 = str.equals(str1);
        // System.out.println(bool1);
        // boolean bool2 = str.equalsIgnoreCase(str1);
        // System.out.println(bool2);

        // String result_str = str.substring(2,5);
        // System.out.println(result_str);

        // for (int i = 0; i < str.length(); i++) {
        //     char a = str.charAt(i);
        //     System.out.println(a);
        // }

        // String str_xin = str.replace("a", "A");
        // System.out.println(str);
        // System.out.println(str_xin);


        // StringBuilder sb = new StringBuilder();
        // sb.append("abc").append("bcd");
        
        // System.out.println(sb.capacity());
        // System.out.println(sb.length());
        // // 反转
        // sb.reverse();
        
        // System.out.println(sb.toString());

        // StringJoiner sj = new StringJoiner(",","[","]");
        // // String str = sj.add("abc").add("def").toString();
        // sj.add("abc").add("def");
        // String str = sj.toString();
        // System.out.println(str);
        // System.out.println('0'+0);
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum = str_int(str);
        int A = sum*2;
        System.out.println(sum);
        System.out.println(A);
        
    }

    public static int str_int(String str){
        int sum =0;
        for (int i = 0; i < str.length(); i++) {
            int a = str.charAt(i)-48;
            sum =sum*10+a;
        }
        return sum;
    }

}
