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

    DrwasPart br1 = new DrwasPart(startX, startY, sz); // class for saving maps on a string
    MapDir smM = new MapDir();

    public void draw(){

        for (int i = 0; i < maxX; i++){
            for (int j = 0; j < maxY; j++){
                map[i][j] = Character.getNumericValue(smM.map_House(j).charAt(i));
            }
        }

        Graphics g = this.getGraphics();
        for (int i = 0; i < maxX; i++){
            for (int j = 0; j < maxY; j++){
                if (map[i][j] == 1){
                    br1 = new DrwasPart(startX + sz * i, startY + ((sz/2) * j), sz);
                    br1.draw(g); //Moving this command up in the if-statement fixed the issue with the top left wall.
                }
            }
        }
    }

    @Override public void paint(Graphics g){
        setBackground(Color.gray);
        draw();
    }

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

