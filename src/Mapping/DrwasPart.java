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

    public void draw(Graphics g, int t){

        if (t == 1) {   // Brick-Texture
            System.out.println("Brick");
            g.setColor(Color.red);
            g.fillRect(PosX, PosY, wi + 1, he);

            g.setColor(Color.black);
            // offset row of bricks
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
        }

        if (t == 2) { // Grass-Texture
            System.out.println("Grass");
            g.setColor(Color.decode("#00ab00"));
            g.fillRect(PosX, PosY, wi + 1, he);

            g.setColor(Color.decode("#00d400"));
            g.fillRect(PosX, PosY, wi / 2, he / 2);
            g.fillRect(PosX + (wi / 2), PosY + (he / 2), wi / 2, he / 2);
        }

        if (t == 3) { // Plank-Texture
            System.out.println("Plank");
            g.setColor(Color.decode("#823200"));
            g.fillRect(PosX, PosY, wi + 1, he);

            g.setColor(Color.decode("#592200"));
            // offset row of bricks
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
        }

        if (t == 4) { // Door-Texture
            System.out.println("Door");
            g.setColor(Color.decode("#823200"));
            g.fillRect(PosX, PosY, wi + 1, he);

            g.setColor(Color.decode("#592200"));
            g.fillRect(PosX, PosY, wi / 4, he);
            g.fillRect(PosX + ((wi / 4) * 3), PosY, wi / 4, he);
            g.fillRect(PosX, PosY, wi, he / 8);
            g.fillRect(PosX, PosY + ((he / 8) * 9), wi, he / 8);
        }

        if (t == 5){ // Glass-Texture
            System.out.println("Glass");
            g.setColor(Color.decode("#00569d"));
            g.fillRect(PosX, PosY, wi + 1, he);

            g.setColor(Color.gray);
            g.fillRect(PosX, PosY, wi, he / 8);
            g.fillRect(PosX, PosY + ((he / 8) * 9), wi, he / 8);
            g.fillRect(PosX, PosY, wi / 8, he);
            g.fillRect(PosX + ((wi / 8) * 7), PosY, wi / 8, he);
        }

        if (t == 6){ // Stairs-Texture
            System.out.println("Stairs");
            g.setColor(Color.decode("#616161"));
            g.fillRect(PosX, PosY, wi + 1, he);

            g.setColor(Color.gray);
            g.fillRect(PosX, PosY, wi, he / 8);
            g.fillRect(PosX, PosY + ((he / 8) * 9), wi, he / 8);
            g.fillRect(PosX, PosY + ((he / 8) * 5), wi, he / 8);
            g.fillRect(PosX, PosY, wi / 8, he);
            g.fillRect(PosX + ((wi / 8) * 7), PosY, wi / 8, he);
        }
    }
}