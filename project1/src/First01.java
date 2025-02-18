import java.util.Scanner;

public class First01 {
    public static void main(String[] args) {
        // System.out.println("12");
        Scanner sc = new Scanner(System.in);
        System.out.print("输入第一个数字:");
        int number1 = sc.nextInt();
        // System.out.println();
        System.out.print("输入第二个数字:");
        int number2 = sc.nextInt();
        int sum = sum(number1, number2);
        System.out.println("这2个数字之和为:"+sum);

    }

    public static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
}
