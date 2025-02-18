package com.youxi.first;

public class cs {
    public static void main(String[] args) {
        gedou t1 = new gedou(100,"陆聪");
        gedou t2 = new gedou(100,"测试");
        while (true) {
            if (t1.getXueliang()==0 || t2.getXueliang()==0) {
                break;
            }
            t1.daJia(t2);
            t2.daJia(t1);
        }
    }
}
