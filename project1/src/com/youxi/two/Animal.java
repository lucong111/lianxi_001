package com.youxi.two;

class Animal {
    private String name;
        private int age;
        public Animal() {
    }
    public Animal(String name, int age) {
        this.name = name;
            this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
class Cat extends Animal {
    public Cat() {
    }
    public Cat(String name, int age) {
        super(name, age);
    }
    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
class Dog extends Animal {
    public Dog() {
    }
    public Dog(String name, int age) {
        super(name, age);
    }
    public void lookDoor() {
        System.out.println("狗看门");
    }
}
