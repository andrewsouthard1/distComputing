package com.andrewsouthard.ch1;

/**
 * Created by andrewsouthard on 8/10/17.
 */
public class SomeThread extends Thread {

    int myID;

    SomeThread(int id){
        this.myID = id;
    }

    public void run() {
        int i;
        for(i = 1; i < 11; i++){
            System.out.println("Thread " + myID + ": " + i);
        }
    }
}
