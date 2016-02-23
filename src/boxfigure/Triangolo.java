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
public class Triangolo extends BoundingBox{
    private final Point2D a;
    private final Point2D b;
    private final Point2D c;
    
    public Triangolo(Point2D a, Point2D b, Point2D c){
        this.a = a;
        this.b = b;
        this.c = c;
        
        this.min = calcMin();
        this.max = calcMax();
    }
    @Override
    final Point2D calcMin() {
        Point2D punto = new Point2D(this.a.getX(),this.c.getY());
        return punto;
    }

    @Override
    final Point2D calcMax() {
        return this.b;
    }
    
}
