import javax.swing.*;
import java.awt.*;

public class DrwasOG2 extends JFrame{

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

        for(int i= 0; i<5; i++){
            g.drawLine(PosX, PosY + (5*i), PosX+40, PosY + (5*i));
            //PosY=PosY+5;
        }
        for(int i= 0; i<5; i++){
            g.drawLine(PosX + (10*i),PosY,PosX +(10*i),PosY + 5);
        }

        for(int i=0; i<4; i++){
            g.drawLine((PosX + 5) + (10*i),PosY + 5, (PosX+5)+(10*i), PosY+10);
        }

        for(int i=0; i<5; i++){
            g.drawLine(PosX + (10*i),PosY +10,PosX +(10*i),PosY + 15);
        }

        for(int i=0; i<4 ; i++){
            g.drawLine((PosX + 5) + (10*i),PosY + 15, (PosX+5)+(10*i), PosY+20);
        }

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
        DrwasOG2 br = new DrwasOG2();
        br.setSize(600,600);
        br.setResizable(false);
        br.setTitle("Brick1");
        br.setVisible(true);
        br.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        br.draw();
    }
}

