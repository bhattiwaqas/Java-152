/* Waqas Bhatti
Professor Hong
Llama project

*/
package llamas;
//import java.util.Scanner;
import javax.swing.*;

public class LLAMAS {
    static int side, llamas, cost;
    static double area;
    
    public static void main(String[] args) {
        /*Scanner kb = new Scanner(System.in);
        
        int side, llamas, cost;
        double area;
        // area of octagon A = 2(1+/2)a^2
        
        String s1 = JOptionPane.showInputDialog("Input the dimensions of the plot of land: ");
        side = Integer.parseInt(s1);
        System.out.print("Input the dimensions of the plot of land: ");
        side = kb.nextInt();
        
        *area = 2*(1+Math.sqrt(2))*Math.pow(side,2);
        //System.out.println("area: " + area);
        
        llamas = (int) area/42;
        cost = 250*llamas;
        
        //System.out.println("Total amount of llamas: " + llamas);
        //System.out.println("Total cost : $" + cost);
        */
        
        String s1 = JOptionPane.showInputDialog("Input the dimensions of the plot of land: ");
        side = Integer.parseInt(s1);
        Calculate();
        JOptionPane.showMessageDialog(null, "Total llamas: " + llamas);
        JOptionPane.showMessageDialog(null, "Total cost: $" + cost);
        
    }
    public static void Calculate() {
        area = 2*(1+Math.sqrt(2))*Math.pow(side,2);
        
        llamas = (int) area/42;
        cost = 250*llamas;
    
    }
}
