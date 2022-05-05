package Mapping;

import javax.swing.*;
import java.awt.*;

public class Map2 extends JFrame{

    int sz = 40; // size of the bricks
    int strtX = 10; // starting position for X
    int strtY = 40; // starting position for Y
    int maxX = 13;
    int maxY = maxX * 2;
    int[][] map = new int [maxX][maxY]; // "memory" for the map
    String[] mapA = new String[maxY]; // actual map saved as string

    DrwasPart br1 = new DrwasPart( strtX, strtY, sz);

    public void draw(){

        mapA[0]  = "0000000000000";
        mapA[1]  = "0000000000000";
        mapA[2]  = "0000000000000";
        mapA[3]  = "0000000000000";
        mapA[4]  = "0000000000000";
        mapA[5]  = "0000000000000";
        mapA[6]  = "0000000000000";
        mapA[7]  = "0000000000000";
        mapA[8]  = "0000000000000";
        mapA[9]  = "0000000000000";
        mapA[10] = "0000000000000";
        mapA[11] = "0000000000000";
        mapA[12] = "0000000000000";
        mapA[13] = "0000000000000"; // This is cancer.
        mapA[14] = "0000000000000";
        mapA[15] = "0000000000000";
        mapA[16] = "0000000000000";
        mapA[17] = "0000000000000"; // TODO: Save maps as individual classes, such as to "easily" change them.
        mapA[18] = "0000000000000";
        mapA[19] = "0000000000000";
        mapA[20] = "0000000000000";
        mapA[21] = "0000000000000";
        mapA[22] = "0000000000000";
        mapA[23] = "0000000000000";
        mapA[24] = "0000000000000";
        mapA[25] = "0000000000000";

        for (int i = 0; i < maxX; i++){
            for (int j = 0; j < maxY; j++){
                map[i][j] = 1;
                // have to use "getCharAt" shenanigans
            }
        }

        Graphics g = this.getGraphics();
        for (int i = 0; i < maxX; i++){
            for (int j = 0; j < maxY; j++){
                if (map[i][j] == 1){
                    br1 = new DrwasPart(strtX + sz * i, strtY + ((sz/2) * j), sz);
                }
                br1.draw(g);
            }
        }
        /*
        br1.draw(g);
        br1 = new DrwasPart(strtX + sz * 2, strtY, sz);
        br1.draw(g);    // IT FUCKING WORKS!!!
        br1 = new DrwasPart(strtX + sz * 3, strtY + (sz/2), sz);
        br1.draw(g);
        br1 = new DrwasPart(strtX + sz * 13, strtY, sz); // 12
        br1.draw(g);
         */

        // TODO: Use some sort of grid to save the map layout.

        // For some reason the program fails to load properly sometimes for some godforsaken reason. I swear this PC is cursed!
    }

    @Override public void paint(Graphics g){
        setBackground(Color.white);
        draw();
    }

    // main method
    public static void main(String[] args){
        Map2 m = new Map2();
        m.setSize(600,600);
        m.setResizable(false);
        m.setTitle("Map2");
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.draw();
        System.out.println(" ----TheBoringEdward---- ");
    }
}

