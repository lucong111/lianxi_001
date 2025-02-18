package com.denglu.classs;

public class Test1 {
    
    public Test1(){
        this("张三",18);
    }
    public Test1(String name,int age){
        System.out.println("姓名："+name+"，年龄："+age);
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
    }
}

