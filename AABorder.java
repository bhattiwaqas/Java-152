
package nb.test.gamepackagev1;
import java.awt.*;

public class Border {
    private int x=0, y=0; //private=only in this class
    
    public Border(int x, int y){ // x,y = coordinates
        this.x=x;
        this.y=y;
    } //end Snowperson method
    
    public void show(Graphics g){
        Color brown = new Color(201, 113, 18);
        g.setColor(brown);
        
        
        g.fillRect(x+0,y+0,500,50); //top
        g.fillRect(x+0,y+0,30,500); //left
        g.fillRect(x+0,y+470,500,30); //bottom
        g.fillRect(x+470,y+0,30,500); //right
        
        //6 holes
        g.fillOval(x+50, y+170, 70, 20); //top left
        g.fillOval(x+215, y+170, 70, 20); //top mid
        g.fillOval(x+380, y+170, 70, 20); //top right
        g.fillOval(x+50, y+320, 70, 20); //bottom left
        g.fillOval(x+215, y+320, 70, 20); //bottom mid
        g.fillOval(x+380, y+320, 70, 20); //bottom right
        

       
    } // end show method
}
