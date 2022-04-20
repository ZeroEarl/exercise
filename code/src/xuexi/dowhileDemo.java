package xuexi;

import java.io.PrintStream;

public class dowhileDemo {
    public static void main(String[] args) {
        //珠峰8848860毫米，一张纸0.1毫米，问折叠多少次？

        //定义纸张和珠峰
        double zhi = 0.1;
        double zhufeng =8848860;
        //定义变量储存折叠次数
        int zhedie=0;

        //循环控制纸张折叠
        while (zhi<zhufeng){
            zhi*=2;
            zhedie++;
        }
        System.out.println("折叠次数："+zhedie);
        System.out.println("纸张最终厚度："+zhi);
    }
}
