import java.awt.*;
import javax.swing.*;

public class Drwas extends JFrame{

    final private int ogPosY = 100;
    final private int ogPosX = 100;
    int PosX = ogPosX;
    int PosY = ogPosY;
    int wi = 40;
    int he = wi / 2;
    int wd = wi / 4;
    int hd = he / 4;
    //private Graphics g;

    /*
    Drwas (int PosX, int PosY, int wi){
        this.PosX = PosX;
        this.PosY = PosY;
        this.wi = wi;
    }
     */

    private void draw(){
        Graphics g = this.getGraphics();

        // red background
        g.setColor(Color.red);
        g.fillRect(PosX, PosY, wi + 1, he);

        // black lines
        g.setColor(Color.black);


        for (int i = 4; i > 0; i--) {
            g.drawLine(PosX + (wd * i) - wd / 2, PosY + hd, PosX + (wd * i) - wd / 2, PosY + (hd * 2)); //vertical
            g.drawLine(PosX + (wd * i) - wd / 2, PosY + (hd * 3), PosX + (wd * i) - wd / 2, PosY + (hd * 4)); //vertical
        }


        for (int i = 5; i > 0; i--) {
            g.drawLine(PosX + (wd * (i - 1)), PosY + (hd * 2), PosX + (wd * (i - 1)), PosY + (hd * 3)); //vertical
            g.drawLine(PosX + (wd * (i - 1)), PosY, PosX + (wd * (i - 1)), PosY + (hd)); //vertical
            g.drawLine(PosX, PosY + (hd * (i - 1)), PosX + wi, PosY + (hd * (i - 1))); //horizontal
        }


        // TODO: FIX THIS CRAP!!!

    }

    @Override public void paint(Graphics g){
        setBackground(Color.white);
        draw();
    }

    public static void main(String[] args){
        Drwas br = new Drwas();
        br.setSize(600,600);
        br.setResizable(false);
        br.setTitle("Brick1");
        br.setVisible(true);
        br.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        br.draw();
    }
}

