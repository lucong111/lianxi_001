package com.denglu.classs;

public class Phone1 {
    String name;
    double price;

    public Phone1(){}

    public Phone1(String name,double price){
        this.price=price;
        this.name=name;
    }

    
    public void call(){
        System.out.println("打电话");
    }
}


