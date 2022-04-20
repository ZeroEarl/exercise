package xuexi;

public class ForForDemo {
    public static void main(String[] args) {
        //每天赢三把，一共玩五天

        //天数循环
        for (int i = 0; i < 5; i++) {
            //把数循环
            for (int j = 0; j < 3; j++) {
                System.out.printf("首胜 ");
            }
            System.out.println();
        }
    }
}
