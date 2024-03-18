
package nb.test.gamepackagev1;
import java.awt.*;

public class Moles {
    private int x=0, y=0; //private=only in this class

    /**
     *
     */
    public boolean visible;
    
    public Moles(int x, int y){ this.visible = true;
// x,y = coordinates
        this.x=x;
        this.y=y;
        
        
    } //end Snowperson method
    
    public void show(Graphics g){
        //mole
        g.setColor(Color.red);
        g.fillArc(x,y,50,90,0, 180); //top left //60,130
        /*g.fillArc(x+225,y+130,50,90,0, 180); //top mid
        g.fillArc(x+390,y+130,50,90,0, 180); //top right
        g.fillArc(x+60,y+280,50,90,0, 180); //bottom left
        g.fillArc(x+225,y+280,50,90,0, 180); //bottom mid
        g.fillArc(x+390,y+280,50,90,0, 180); //bottom right
        */
        g.setColor(Color.black);
        g.drawLine(x+17,y+10, x+17, y+20);
        g.drawLine(x+33, y+10, x+33, y+20);
    } // end show method
    
    
    public int getX(){
        return x;
    }
    public void setX(int newX){
        x = newX;
    } // end setX
    
    public int getY(){
        return y;
    }
    public void setY(int newY){
        y = newY;
    } // end setY
    
    
    public boolean getVisible(){
        return visible; //returns true/false.
    }
    public void setVisible(boolean newVisible){
        visible = newVisible; //sets object var to true or false
    }
    
}//end class
