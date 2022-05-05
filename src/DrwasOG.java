import java.awt.*;
import javax.swing.*;

public class DrwasOG extends JFrame{

    private int PosX = 100;
    private int PosY = 100;
    private Graphics g;


    private void draw(){
        g = this.getGraphics();

        // red background
        g.setColor(Color.red);
        g.fillRect(PosX, PosY, 40 + 1, 20);

        // black lines
        g.setColor(Color.black);

        g.drawLine(PosX, PosY, 140, PosY);
        g.drawLine(PosX, PosY + 5, 140, PosY + 5);
        g.drawLine(PosX, PosY + 10, 140, PosY + 10);
        g.drawLine(PosX, PosY + 15, 140, PosY + 15);
        g.drawLine(PosX, PosY + 20, 140, PosY + 20);
        g.drawLine(PosX, PosY, PosX, PosY + 5);
        g.drawLine(PosX+10, PosY, PosX+ 10, PosY +5);
        g.drawLine(PosX+20, PosY, PosX+ 20, PosY +5);
        g.drawLine(PosX+30, PosY, PosX+ 30, PosY +5);
        g.drawLine(PosX+40, PosY, PosX+ 40, PosY +5);
        g.drawLine(PosX+5, PosY +5, PosX+ 5, PosY + 10);
        g.drawLine(PosX+10, PosY +10, PosX+10, PosY + 15);
        g.drawLine(PosX+15, PosY +5, PosX+15, PosY + 10);
        g.drawLine(PosX+25, PosY +5, PosX+25, PosY + 10);
        g.drawLine(PosX+35, PosY +5, PosX+35, PosY + 10);
        g.drawLine(PosX+20, PosY +10, PosX+20, PosY + 15);
        g.drawLine(PosX+30, PosY +10, PosX+30, PosY +15);
        g.drawLine(PosX+40, PosY +10, PosX+40, PosY +15);
        g.drawLine(PosX, PosY +10, PosX, PosY +15);
        g.drawLine(PosX+5, PosY+15, PosX+5, PosY +20);
        g.drawLine(PosX+15, PosY+15, PosX+15, PosY +20);
        g.drawLine(PosX+25, PosY+15, PosX+25, PosY +20);
        g.drawLine(PosX+35, PosY+15, PosX+35, PosY +20);

        // vertical lines, row 4
        // your task!

        // TODO: FIX THIS CRAP!!!

    }

    @Override public void paint(Graphics g){
        setBackground(Color.white);
        draw();
    }

    // main method
    public static void main(String[] args){
        DrwasOG br = new DrwasOG();
        br.setSize(600,600);
        br.setResizable(false);
        br.setTitle("Brick1");
        br.setVisible(true);
        br.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        br.draw();
    }
}

