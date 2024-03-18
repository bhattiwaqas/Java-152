/*
 Waqas Bhatti
LLAMAS with 2 methods
 */
package llamas_methods;
import javax.swing.*;

public class LLAMAS_METHODS {
    static int llamas, cost; //static int so I can print outside of Calculate method and maintain value of llamas and cost var.
    
    public static void main(String[] args) {
        int length;
        double area;
        
        String s1 = JOptionPane.showInputDialog("Input the dimensions of the plot of land: ");
        length = Integer.parseInt(s1);
        
        area = areaform(length); //return double method, returns area
        //System.out.println("area is: " + area);
        
        Calculate(area); // void method
        
        JOptionPane.showMessageDialog(null, "Total llamas: " + llamas);
        JOptionPane.showMessageDialog(null, "Total cost: $" + cost);
        
    }
    public static void Calculate(double area) {
        
        llamas = (int) area/42;
        cost = 250*llamas;
    }
    public static double areaform(int length){
        double area = 2*(1+Math.sqrt(2))*Math.pow(length,2);
        return area;
    
    }   
}
