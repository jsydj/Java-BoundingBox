/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxfigure;

import javafx.geometry.Point2D;

/**
 *
 * @author SlayerCandy0369
 */
public class BoxFigure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cerchio uno = new Cerchio(4,4,10);
        Cerchio due = new Cerchio(7,1,2);
        
        System.out.println("La risposta e': "+uno.contain(due.getMax(),due.getMin()));
        
        Triangolo prova1 = new Triangolo(new Point2D(2,2), new Point2D(10,2), new Point2D(6,8));
        Triangolo prova2 = new Triangolo(new Point2D(7,2), new Point2D(10,2), new Point2D(10,5));
        
        System.out.println("La codizione e': "+prova1.contain(prova2.getMax(),prova2.getMin()));
    }
    
}
