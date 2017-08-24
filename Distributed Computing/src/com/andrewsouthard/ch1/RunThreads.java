package com.andrewsouthard.ch1;

/**
 * Created by andrewsouthard on 8/10/17.
 */


public class RunThreads {
    public static void main (String[] args){
        SomeThread p1 = new SomeThread(1);
        p1.start();

        SomeThread p2 = new SomeThread(2);
        p2.start();

        SomeThread p3 = new SomeThread(3);
        p3.start();
    }
}
