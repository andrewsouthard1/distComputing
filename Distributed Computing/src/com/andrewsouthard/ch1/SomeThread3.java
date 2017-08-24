package com.andrewsouthard.ch1;

/**
 * Created by andrewsouthard on 8/24/17.
 */
public class SomeThread3 implements Runnable {
    static int count = 0;

    SomeThread3(){
        super( );
    }

    public void run() {
        update( );
    }

    static public synchronized void update(){
        int myCount = count;

        int second = (int)(Math.random() * 500.0);
        try {
            Thread.sleep(second);
        }
        catch (InterruptedException e){
        }

        myCount++;
        count = myCount;
        System.out.println("count="+count+"; thread count=" + Thread.activeCount());
    }
}
