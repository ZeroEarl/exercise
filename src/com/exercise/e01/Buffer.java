package com.exercise.e01;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
    private Queue<Integer>queue = new LinkedList();
    private int size = 10;

    public synchronized void add(int val) throws InterruptedException{
        if (queue.size()>size){
            wait();
        }
        queue.add(val);
        notify();
    }

    public synchronized int pull() throws InterruptedException{
        if (queue.size() == 0){
            wait();
        }
        int val = (int) queue.poll();
        notify();
        return val;
    }

}
