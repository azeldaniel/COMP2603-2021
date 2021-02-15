import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;


public class SimpleShape {
    
    protected Color color;  // the colour of the shape
    protected double area;  // the area of the shape (calculated)
    protected int x;        // the x position on the screen
    protected int y;        // the y position on the screen
    protected static int xLoc = 5;
    protected static int yLoc = 40;
    
    
    public SimpleShape(){
       color = Color.black;
       x = xLoc;
       y = yLoc;
    }
    
    public void setColor(Color c){
        color = c;
    }
    public Color getColor(){
        return color;
    }
    public double getArea(){
        return area;
    }
    
    public Shape draw(){
        return null;
    }
    
    public void calculateArea(){ 
    }
    
    public String toString(){
        String s = "Area: " + String.format("%.2f", area); 
        return s;
        
    }
    
}
