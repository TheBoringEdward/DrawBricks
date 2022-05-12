import java.awt.*;
import javax.swing.*;

public class DrwasOG extends JFrame{

    @Override public void paint(Graphics g){
        setBackground(Color.white);
        g = this.getGraphics();

        System.out.println("once");

        // TODO: This gets drawn two time!!! WHY?!?!

        // red background
        g.setColor(Color.red);
        int posY = 100;
        int posX = 100;
        g.fillRect(posX, posY, 40 + 1, 20);

        // black lines
        g.setColor(Color.black);

        g.drawLine(posX, posY, 140, posY);
        g.drawLine(posX, posY + 5, 140, posY + 5);
        g.drawLine(posX, posY + 10, 140, posY + 10);
        g.drawLine(posX, posY + 15, 140, posY + 15);
        g.drawLine(posX, posY + 20, 140, posY + 20);
        g.drawLine(posX, posY, posX, posY + 5);
        g.drawLine(posX +10, posY, posX + 10, posY +5);
        g.drawLine(posX +20, posY, posX + 20, posY +5);
        g.drawLine(posX +30, posY, posX + 30, posY +5);
        g.drawLine(posX +40, posY, posX + 40, posY +5);
        g.drawLine(posX +5, posY +5, posX + 5, posY + 10);
        g.drawLine(posX +10, posY +10, posX +10, posY + 15);
        g.drawLine(posX +15, posY +5, posX +15, posY + 10);
        g.drawLine(posX +25, posY +5, posX +25, posY + 10);
        g.drawLine(posX +35, posY +5, posX +35, posY + 10);
        g.drawLine(posX +20, posY +10, posX +20, posY + 15);
        g.drawLine(posX +30, posY +10, posX +30, posY +15);
        g.drawLine(posX +40, posY +10, posX +40, posY +15);
        g.drawLine(posX, posY +10, posX, posY +15);
        g.drawLine(posX +5, posY +15, posX +5, posY +20);
        g.drawLine(posX +15, posY +15, posX +15, posY +20);
        g.drawLine(posX +25, posY +15, posX +25, posY +20);
        g.drawLine(posX +35, posY +15, posX +35, posY +20);

        // vertical lines, row 4
        // your task!

    }

    // main method
    public static void main(String[] args){
        DrwasOG br = new DrwasOG();
        br.setSize(600,600);
        br.setResizable(false);
        br.setTitle("Brick1");
        br.setVisible(true);
        br.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

