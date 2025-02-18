package com.youxi.two;

public class Vehice {
    private double speed;
    private double size;
    public Vehice(){

    }

    public Vehice(double speed,double size){
        this.speed = speed;
        this.size = size;
    }
    
    public void setSpeed(double speed){
        this.speed = speed;
    }

    public double getSpeed(){
        return this.speed;
    }
    
    public void setSize(double size){
        this.size = size;
    }

    public double getSize(){
        return this.size;
    }

}
