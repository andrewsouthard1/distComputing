package com.andrewsouthard.ch1;

import java.io.*;

/**
 * Created by andrewsouthard on 8/10/17.
 */
public class basicApplet {

    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        String theName;
        System.out.println("What is your name?");
        theName = keyboard.readLine();
        System.out.println("Hello " + theName);

    }
}
