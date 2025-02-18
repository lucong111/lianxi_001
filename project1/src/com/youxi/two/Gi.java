package com.youxi.two;

class G{
 
    static{
        System.out. println("我是父类静态代码块");
    }
    
    {
        System. out.println("我是父类实例代码块");
    }
 
    public G(){
        System. out. println("我是父类构造方法");
    }
}
 
class A extends G{
 
    static{
        System.out.println("我是子类静态代码块");
    }
    
    {
        System.out.println("我是子类实例代码块");
    }
 
    public A(){
        System.out.println("我是子类构造方法");
    }
}