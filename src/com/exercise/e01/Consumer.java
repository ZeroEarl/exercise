package com.exercise.e01;

public class Consumer extends Thread{
    private Buffer buffer;
    public Consumer(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int val = 0;
            try {
                val = buffer.pull();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(val);
        }
    }
}
