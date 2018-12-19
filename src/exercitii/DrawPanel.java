package exercitii;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    int x;
    int y;
    int z;
    int q;
    int red = (int) (Math.random() * 256);
    int green = (int) (Math.random() * 256);
    int blue = (int) (Math.random() * 256);
    private Graphics g;

    protected void setXY(int x, int y) {
        this.x = 200;
        this.y = 125;
        this.z = 400;
        this.q = 250;
    }

    @Override
    protected void paintComponent(Graphics g) {
        this.g = g;
        g.setColor( new Color( red, green, blue ) );
        g.fillRect( x, y, z, q );
    }

    public void getMinimumSize(int x, int i) {
        for (x = 0; x <= 10; x--) {
            for (i = 0; i <= 10; i--) ;
            repaint();
        }
        try {
            Thread.sleep( 3 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}