package Mapping;

import javax.swing.*;
import java.awt.*;

public class Map2 extends JFrame{

    int sz = 40; // size of the bricks
    int startX = 10; // starting position for X
    int startY = 40; // starting position for Y
    int maxX = 13; // limits amount of walls in x direction
    int maxY = maxX * 2; // limits amount of walls in y direction
    int[][] map = new int [maxX][maxY]; // "memory" for the map

    boolean once = false;
    DrwasPart br1 = new DrwasPart(startX, startY, sz); // class for drawing wall-texture
    MapDir smM = new MapDir(maxX); // class for saving maps on a string


    public void paint(Graphics g){    // I don't even understand where this method gets executed.
        super.paint(g); // This didn't fix it either!
        if(!once) {

            System.out.println( once ); // should show once. shows twice...
            System.out.println(" --- ONCE ---"); // This gets executed two times.


            // Saves map-file onto "memory"
            for (int i = 0; i < maxX; i++) {
                for (int j = 0; j < maxY; j++) {
                    map[i][j] = Character.getNumericValue(smM.map_House(j).charAt(i));
                }
            }

            System.out.println("hecc. this should only print one time"); // IT'S FUCKING CURSED!!!!!!!!

            // Draws map from "memory"
            for (int i = 0; i < maxY; i++) {
                for (int j = 0; j < maxX; j++) {
                    if (smM.map_House(i).charAt(j) != ' ') {
                        br1 = new DrwasPart(startX + sz * j, startY + ((sz / 2) * i), sz);
                        br1.draw(g, map[j][i]);
                    }
                }
            }
            once = true; // This doesn't work either
        }
        System.out.println(once); // IT DOES NOT WORK!!!
    }

    public static void main(String[] args){
        Map2 m = new Map2();
        m.setSize(600,600);
        m.setBackground(Color.decode("#1aa7ec")); // Can't set the background colour. It does flicker blue for a split second, but that's it.
        m.setResizable(false);
        m.setTitle("Map2");
        m.setVisible(true); // There's no "paint" here!!! I'm loosing my mind!!!
        System.out.println(" ----TheBoringEdward---- "); // It executes AFTER printing this!!! WHY?!?!
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

