package boxfigure;

//import java.awt.Graphics;
import static boxfigure.EasyInput.*;
import javafx.geometry.Point2D;
import javax.swing.JFrame;

public class BoxFigure {
   
    public static void main(String[] args) {
        int figura1;
        int figura2;
        
        menu();
        
        figura1 = inputI("Inserisci la prima figura: ");
        BoundingBox a = null;
        switch(figura1){
            case 0:
                double raggio = inputD("Inserisci il raggio: ");
                Point2D centro = inputP2D("Inserisci le coordinate del centro: ");
                a = new Cerchio(centro.getX(), centro.getY(), raggio);
                //System.out.println(centro.getX()+""+centro.getY());
                break;
            case 1:
                double lato = inputD("Inserisci il lato: ");
                Point2D min = inputP2D("Inserisci le coordinate del punto: ");
                a = new Quadrato(lato, min);
                //System.out.println(a.calcMax());
                break;
            case 2:
                Point2D a1,b1,c1;
                a1 = inputP2D("Inserisci le coordinate del punto a: ");
                b1 = inputP2D("Inserisci le coordinate del punto b: ");
                c1 = inputP2D("Inserisci le coordinate del putno c: ");
                
                a = new Triangolo(a1,b1,c1);
                break;
            default:
                System.err.println("Errore! Figura inesistente.");
                //a = null;
                System.exit(1);
                break;
        }
        
        figura2 = inputI("Inserisci la seconda figura: ");
        BoundingBox b = null;
        switch(figura2){
            case 0:
                double raggio = inputD("Inserisci il raggio: ");
                Point2D centro = inputP2D("Inserisci le coordinate del centro: ");
                b = new Cerchio(centro.getX(), centro.getY(), raggio);
                //System.out.println(centro.getX()+""+centro.getY());
                break;
            case 1:
                double lato = inputD("Inserisci il lato: ");
                Point2D min = inputP2D("Inserisci le coordinate del punto: ");
                b = new Quadrato(lato, min);
                //System.out.println(a.calcMax());
                break;
            case 2:
                Point2D a1,b1,c1;
                a1 = inputP2D("Inserisci le coordinate del punto a: ");
                b1 = inputP2D("Inserisci le coordinate del punto b: ");
                c1 = inputP2D("Inserisci le coordinate del putno c: ");
                
                b = new Triangolo(a1,b1,c1);
                break;
            default:
                System.err.println("Errore! Figura inesistente.");
                //b = null;
                System.exit(2);
                break;
        }
        
        System.out.println(a.getMax());
        /*
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
        
        
        JFrame f = new JFrame("Title");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        disenga p = new disenga(uno,due);
    
        f.add(p);
        f.setSize(400,250);
        f.setVisible(true); */
    }
    
     private static void menu(){
        System.out.println("BOUNDING BOX");
        System.out.println("---------------------------------");
        
        System.out.println("Figure disponibili:");
        System.out.println("\t[0] Cerchio\n\t[1] Quadrto\n\t[2] Triangolo");
        System.out.println("---------------------------------");

    }
    
}