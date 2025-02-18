package com.youxi.first;

import java.util.Random;

public class gedou {
    private int xueliang;
    private String name;
    public gedou(){}
    public gedou(int xueliang,String name){
        this.xueliang = xueliang;
        this.name = name;
    }

    public void setXueliang(int xueliang) {
        this.xueliang = xueliang;
    }

    public int getXueliang() {
        return xueliang;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void daJia(gedou rGedou){
        Random r = new Random();
        
        int random_num = r.nextInt(20)+1;
        
        this.xueliang -=random_num; 
        this.xueliang = this.xueliang < 0 ? 0:this.xueliang;
        System.out.println(this.name+"打了"+rGedou.name+"一下,扣了"+random_num+"血,现在剩余"+this.xueliang+"血量。");
        if (this.xueliang==0) {
            System.out.print(this.name+"KO了"+rGedou.name);
        }
    }

}
