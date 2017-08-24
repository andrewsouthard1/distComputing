package com.andrewsouthard.ch1;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by andrewsouthard on 8/10/17.
 */
public class MyApplet extends Applet {
    public void paint(Graphics g){
        setBackground(Color.blue);

        Font Claude = new Font("Arial", Font.BOLD, 40);
        g.setFont(Claude);
        g.setColor(Color.yellow);
        g.drawString("Hello World!", 100, 100);
    }
}
