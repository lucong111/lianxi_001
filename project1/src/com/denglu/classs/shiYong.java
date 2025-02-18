package com.denglu.classs;

public class shiYong {
    public static void main(String[] args) {
        Phone1 p = new Phone1();
        String name = "iphone";
        double price = -10.00;
        p.name = name;
        p.price = price;
        // p.setPrice(price);
        // p.setname(name);
        // Phone p = new Phone(name,price);
        
        // p.call();
        System.out.println(p.name);
        System.out.println(p.price);
    }
    
}
