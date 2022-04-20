package xuexi;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //录入5个工号，随机排序
        //定义动态初始化数组，存储工号
        int [] a =new int[5];

        //定义循环从键盘录入工号
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("请输入第"+(i+1)+"个员工工号：");
            //存储键盘接收
            int b = sc.nextInt();
            //赋值到数组
            a[i]=b;
        }
        //遍历数组每个元素，随即索引，位置交换
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            //随机一个索引
            int index = r.nextInt(a.length);
            int c=a[index];
            a[index]=a[i];
            a[i]=c;
        }
        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }
    }
}
