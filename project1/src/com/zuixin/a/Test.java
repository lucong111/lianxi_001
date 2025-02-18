package com.zuixin.a;

public class Test {
    public static void main(String[] args) {
    shangpin[] sp = new shangpin[3];

    shangpin sp1 = new shangpin(1,"测试1",10.01,1);
    shangpin sp2 = new shangpin(2,"测试2",10.02,2);
    shangpin sp3 = new shangpin(3,"测试3",10.03,3);

    sp[0]=sp1;
    sp[1]=sp2;
    sp[2]=sp3;

    for (int i = 0; i < sp.length; i++) {
        System.out.println( sp[i].getId()+","+sp[i].getName());
    }
    }
}
