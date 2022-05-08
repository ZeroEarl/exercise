package com.exercise.e01;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Producer extends Thread{
    private Buffer buffer;

    public Producer(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            Random random = new Random();
            @Override
            public void run() {
                int num = random.nextInt(1000);
                try {
                    buffer.add(num);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"插入队列的随机数为："+num);
            }
        },0,1000);
    }
}
