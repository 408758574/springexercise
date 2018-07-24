package com.hthl.controller;

import java.util.HashMap;

public class Exercise extends Thread{
    public static int num = 0;
    public  Exercise() {
        num++;
    }
    @Override
    public  void  run() {
        System.out.println("这是创建的第"+num+"个线程");
        HashMap hash = new HashMap<String,String>();
    }
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            Exercise thread = new Exercise();
            thread.start();
            Exercise thread1 = new Exercise();
            thread1.start();
        }
    }
}
