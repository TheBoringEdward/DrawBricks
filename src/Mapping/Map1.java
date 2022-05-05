package Mapping;

import java.awt.*;
import javax.swing.*;

public class Map1 extends JFrame{

    DrwasPart br1 = new DrwasPart(10,40,40);

    public void draw(){
        Graphics g = this.getGraphics();
        br1.draw(g);
    }

    @Override public void paint(Graphics g){
        setBackground(Color.white);
        draw();
    }

    // main method
    public static void main(String[] args){
        Map1 m = new Map1();
        m.setSize(600,600);
        m.setResizable(false);
        m.setTitle("Map1");
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.draw();
    }
}

