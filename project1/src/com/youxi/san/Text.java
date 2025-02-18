package com.youxi.san;

public class Text {
    public static void main(String[] args) {
        Animal A = new Animal("陆聪",15);
        Cat a = new Cat("测试",12);
        System.out.println("------------------------------------");
        System.out.println(A.name+","+A.age);
        System.out.println(a.name+","+a.age);
        // a.name = "lucong";
        // a.age=1;
        // a.eat();
    }
}
