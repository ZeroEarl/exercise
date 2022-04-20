package xuexi;

import java.util.Scanner;

public class deadforDeamo {
    public static void main(String[] args) {
        //系统密码520，用户验证，错误输出密码错误，成功输出欢迎进入系统，停止程序
        int mima = 520;
        //定义一个死循环，让用户验证
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入密码：");
            int i = sc.nextInt();
            //判断密码是否正确
            if (i==mima){
                System.out.printf("欢迎进入系统");
                break;
            }else {
                System.out.printf("密码输入错误，请重新输入");
            }
        }
    }
}
