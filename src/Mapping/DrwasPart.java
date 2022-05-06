package Mapping;

import java.awt.*;
import javax.swing.*;

public class DrwasPart extends JFrame{

    int PosX;
    int PosY;
    int wi;
    int he;
    int wd;
    int hd;


    DrwasPart (int PosX, int PosY, int wi){
        this.PosX = PosX;
        this.PosY = PosY;
        this.wi = wi;
        he = wi / 2;
        wd = wi / 4;
        hd = he / 4;
    }

    public void draw(Graphics g){

        // red background
        g.setColor(Color.red);
        g.fillRect(PosX, PosY, wi + 1, he);

        // black lines
        g.setColor(Color.black);


        for (int i = 4; i > 0; i--) {
            g.drawLine(PosX + (wd * i) - wd / 2, PosY + hd, PosX + (wd * i) - wd / 2, PosY + (hd * 2)); //vertical
            g.drawLine(PosX + (wd * i) - wd / 2, PosY + (hd * 3), PosX + (wd * i) - wd / 2, PosY + (hd * 4)); //vertical
        }

        // This is a mess

        for (int i = 5; i > 0; i--) {
            g.drawLine(PosX + (wd * (i - 1)), PosY + (hd * 2), PosX + (wd * (i - 1)), PosY + (hd * 3)); //vertical
            g.drawLine(PosX + (wd * (i - 1)), PosY, PosX + (wd * (i - 1)), PosY + (hd)); //vertical
            g.drawLine(PosX, PosY + (hd * (i - 1)), PosX + wi, PosY + (hd * (i - 1))); //horizontal
        }


        // TODO: FIX THIS CRAP!!! Edit: Don't you dare touch it! It works as it is

    }
}