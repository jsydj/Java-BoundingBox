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
    String condizione;
    
    public disenga(Cerchio a, Cerchio b){
        this.centro1 = a.getCentro();
        this.raggio1 = (int)a.getRaggio()*15;
        
        this.centro2 = b.getCentro();
        this.raggio2 = (int)b.getRaggio()*15;
        
        this.condizione = "cc";
    }
    
    int pointsX[];
    int pointsY[];
    int OFFSET2 = 10;
    public disenga(Cerchio a, Triangolo b){
        this.centro1 = a.getCentro();
        this.raggio1 = (int)a.getRaggio()*15;
        
        Point2D p1 = b.getA();
        Point2D p2 = b.getB();
        Point2D p3 = b.getC();
        
        int pX[] = {(int)p1.getX()*OFFSET2,(int)p2.getX()*OFFSET2,(int)p3.getX()*OFFSET2};
        int pY[] = {(int)p1.getY()*OFFSET2,(int)p2.getY()*OFFSET2,(int)p3.getY()*OFFSET2};
    
        this.pointsX = pX;
        this.pointsY = pY;
        
        this.condizione = "ct";
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
        switch (this.condizione) {
            case "cc":
                g.setColor(Color.red);
                g.fillOval((int)centro1.getX()+OFFSET, (int)centro1.getY()+OFFSET, raggio1, raggio1);
                g.setColor(Color.blue);
                g.fillOval((int)centro2.getX()+OFFSET+(raggio2), (int)centro2.getY()+OFFSET+(raggio2), raggio2, raggio2);
                break;
            case "ct":
                g.setColor(Color.red);
                g.fillOval((int)centro1.getX()+OFFSET, (int)centro1.getY()+OFFSET, raggio1, raggio1);
                g.setColor(Color.blue);
                //Polygon a = new Polygon(pointsX,points)
                g.fillPolygon(pointsX, pointsY, 3);
                break;
        }
       
    }
}
