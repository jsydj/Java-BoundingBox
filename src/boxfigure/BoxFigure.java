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
        
        Quadrato q2 = new Quadrato(7,new Point2D(1,8));
        Quadrato q1 = new Quadrato(3, new Point2D(3,6));
        
        System.out.println("La codinzione de quadrato e': "+q1.contain(q2.max,q2.min));
        
        System.out.println("MISTI\n-----------------");
        
        Triangolo grosso = new Triangolo(new Point2D(2,2), new Point2D(12,2), new Point2D(7,12));
        Quadrato piccolo = new Quadrato(4, new Point2D(5,7));
        
        System.out.println("Sara' Quadrato contenuto nel Triangolo ??\n"+grosso.contain(piccolo));
    }
    
}
