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
        // Scanner sc = new Scanner(System.in);
        // String str = sc.next();
        // int sum = str_int(str);
        // int A = sum*2;
        // System.out.println(sum);
        // System.out.println(A);
        // int count = str_chuxian("abc dabefg", "abc ");
        // System.out.println(count);
        String str1 = "abcdefcabdijk";
        String str2 = "ab";
        // int a = str1.indexOf(str2);
        // int a = str1.indexOf(str2,3);
        int a = str_count(str1, str2);

        System.out.println(a);







    }

// about
// about
// steam


// steam添加的
    // 自己写的计算一个字符串在另一个字符串出现的次数
    public static int str_chuxian(String str, String chuxian_str){
        String result_str = str.replace(chuxian_str, "1");
        int count = 0;
        for (int i = 0; i < result_str.length(); i++) {
            char A = result_str.charAt(i);
            if(A == '1'){
                count++;
            }
        }
        return count;
    }

    // 计算一个字符串在另一个字符串出现的次数       标准的
    public static int str_count(String str, String str_zhaode){
        int count = 0;
        int index;
        while((index = str.indexOf(str_zhaode)) != -1){
            str = str.substring(index+str_zhaode.length());
            count++;
        }
        return count;
    }

    // 字符数字变为int数字
    public static int str_int(String str){
        int sum =0;
        for (int i = 0; i < str.length(); i++) {
            int a = str.charAt(i)-48;
            sum =sum*10+a;
        }
        return sum;
    }

}
