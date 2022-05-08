package com.exercise.e01;

public class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Consumer consumer = new Consumer(buffer);
        Producer producer = new Producer(buffer);

        consumer.start();
        producer.start();

    }
}