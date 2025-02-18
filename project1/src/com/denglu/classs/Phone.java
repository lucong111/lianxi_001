package com.denglu.classs;

public class Phone {
    private String name;
    private double price;

    public Phone(){}

    public Phone(String name,double price){
        if(price>0){
            this.price=price;
        }else{
            System.out.println("不合法");
        }
        this.name=name;
    }

    public void setname(String name){
        this.name=name;
    }

    public String getname(){
       return name; 
    }

    public void setPrice(double price){
        if(price>0){
            this.price=price;
        }else{
            System.out.println('1');
            System.out.println("输入的价格不合法！");
        }
    }

    public double getPrice(){
       return price;
    }

    public void call(){
        System.out.println("打电话");
    }
}
