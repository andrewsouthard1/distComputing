package com.andrewsouthard.ch1;

/**
 * Created by andrewsouthard on 8/24/17.
 */
public class RunThreads3 {
    public static void main (String[] args){
        int originalThreadCount = Thread.activeCount();
        for(int i = 0; i < 10; i++){
            Thread p = new Thread(new SomeThread3());
            p.start();
        }
        System.out.println("thread count=" + Thread.activeCount( ));
        while (Thread.activeCount() > originalThreadCount){

        }
        System.out.println("finally, count = " + SomeThread3.count);
    }
}

