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

    DrwasPart br1 = new DrwasPart(startX, startY, sz); // class for drawing wall-texture
    MapDir smM = new MapDir(maxX); // class for saving maps on a string


    @Override public void paint(Graphics g){    // I don't even understand where this method gets executed.

        System.out.println(" --- ONCE ---"); // This gets executed two times.
        setBackground(Color.decode("#d4d4d4"));
        for (int i = 0; i < maxX; i++){
            for (int j = 0; j < maxY; j++){
                map[i][j] = Character.getNumericValue(smM.map_House(j).charAt(i));
            }
        }

        System.out.println("hecc. this should only print once"); // IT'S FUCKING CURSED!!!!!!!!

        for (int i = 0; i < maxY; i++){
            for (int j = 0; j < maxX; j++){
                if (smM.map_House(i).charAt(j) != ' '){
                    br1 = new DrwasPart(startX + sz * j, startY + ((sz/2) * i), sz);
                    br1.draw(g, map[j][i]); // TODO: Identify the issue with wrong textures being drawn.
                }
            }
        }
        //System.exit(0); // This stops the method from executing an unnecessary amount of times.
                                // Issue is: This fucks up the entire program... So, yeah...
    }

    public static void main(String[] args){
        Map2 m = new Map2();
        m.setSize(600,600);
        m.setResizable(false);
        m.setTitle("Map2");
        m.setVisible(true); // There's no "paint" here!!! I'm loosing my mind!!!
        System.out.println(" ----TheBoringEdward---- "); // It executes AFTER printing this!!! WHY?!?!
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

