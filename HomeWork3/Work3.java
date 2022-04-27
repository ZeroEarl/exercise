package HomeWork3;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.LinkedBlockingQueue;

public class Work3 {
    public static void main(String[] args) {
        LinkedBlockingQueue queue =new LinkedBlockingQueue();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Random random = new Random();
                int num = random.nextInt(1000);
                queue.add(num);
                System.out.println(Thread.currentThread().getName()+"插入队列的随机数为"+num);
            }
        },0,1000);

        for (int i = 0; i < 3; i++) {
            Timer timer1 =new Timer();
            timer1.schedule(new TimerTask() {
                @Override
                public void run() {
                    try {
                        System.out.println(Thread.currentThread().getName()+"取出的队首为"+queue.take());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            },0,2000);

        }
    }
}
