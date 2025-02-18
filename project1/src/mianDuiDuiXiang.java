import java.util.Scanner;

public class mianDuiDuiXiang{
    private String name;
    private int age;
    public mianDuiDuiXiang(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("name:"+name+"\tage:"+age);
    }
    public static void main(String[] dsa){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        mianDuiDuiXiang lian=new mianDuiDuiXiang(name,age);
        lian.display();
    }
}

