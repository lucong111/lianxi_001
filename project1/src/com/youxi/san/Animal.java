package com.youxi.san;


// Animal类
class Animal{
    public String name;
    public int age;
    public Animal(){

    }
    public Animal (String name,int age){
        this.name = name;
        this.age = age;
        System.out.println(this.name);
    }
 
    public void eat(){
        System.out.println(name +"吃饭");
    }
}


// Cat类
class Cat extends Animal{

    public Cat(){
        
    }

    public Cat(String name,int age){
        // super(name,age);
        this.name= name;
        this.age = age;
        String a = super.name;
        System.out.println(a+" "+name+""+age);
    }
 
    @Override
    public void eat(){
    System. out.println(name+"吃鱼");
    }
}


// Dog类
class Dog extends Animal {
    public Dog(String name, int age){
        super(name, age);
    }
 
    @Override
    public void eat(){
        System.out.println(name+"吃骨头");
    }
}
