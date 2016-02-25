/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxfigure;

import java.awt.*;
import javafx.geometry.Point2D;
import javax.swing.JPanel;

public class disenga extends JPanel {
    Point2D centro1;
    Point2D centro2;
    int raggio1;
    int raggio2;
    final int OFFSET = 20;
    public disenga(Cerchio a, Cerchio b){
        this.centro1 = a.getCentro();
        this.raggio1 = (int)a.getRaggio()*15;
        
        this.centro2 = b.getCentro();
        this.raggio2 = (int)b.getRaggio()*15;
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.white);
        /*
        g.setColor(Color.red);
        g.fillRect(25, 25, 100, 30);

        g.setColor(new Color(190, 81, 215));
        g.fillRect(25, 65, 100, 30);
        */
        g.setColor(Color.red);
        g.fillOval((int)centro1.getX()+OFFSET, (int)centro1.getY()+OFFSET, raggio1, raggio1);
        
        g.setColor(Color.blue);
        g.fillOval((int)centro2.getX()+OFFSET+(raggio2), (int)centro2.getY()+OFFSET+(raggio2), raggio2, raggio2);
        
        
    }
}
