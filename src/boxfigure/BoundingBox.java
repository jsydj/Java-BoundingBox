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
public abstract class BoundingBox {
    protected Point2D max;
    protected Point2D min;
    
    abstract Point2D calcMin();
    abstract Point2D calcMax();
  
    public Point2D getMin(){
        return this.min;
    }
    
    public Point2D getMax(){
        return this.max;
    }
    
    public boolean contain(Point2D max, Point2D min){
        return ((min.getX() >= this.min.getX())&&(max.getX() <= this.max.getX())) && ((min.getY() <= this.min.getY())&&(max.getY() >= this.max.getY()));
    
        /*if(((min.getX() >= this.min.getX())&&(max.getX() <= this.max.getX())) && ((min.getY() <= this.min.getY())&&(max.getY() >= this.max.getY())))
                return true;
        else
            return false;*/
    }
    
    
    
    //((min.getX() >= this.min.getX())&&(max.getX <= this.max.getX())) && ((min.getY() <= this.min.getY())&&(max.getY() >= this.max.getY()))
    
    
}
