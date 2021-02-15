import java.awt.geom.RoundRectangle2D;
import java.awt.Shape;

public class Rectangle extends SimpleShape{
    
    private int length;
    private int breadth;
    private int edgeRoundness;
    
    public Rectangle(int l, int b){
        length = l;
        breadth = b;
        edgeRoundness = 0;
        xLoc += length + 10;
    }
    
  
    

}
