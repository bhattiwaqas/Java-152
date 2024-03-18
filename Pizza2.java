/*
 Waqas Bhatti
 calculate slices of pizza based off diameter
 find area given diameter. find amount of slices given the avg slice size.
 */
package pizza2;
//imports here  package, import, public class
import javax.swing.*;

public class Pizza2 {
    //global variables
    static int diameter, sizeSlice, numSlices;
    static double area;
    
    public static void main(String[] args) { //method main
        
        /*//diameter = 18;
        System.out.print("Enter the diameter for your pie: ");
        diameter = kb.nextInt();
        
        //sizeSlice = 30;
        System.out.print("Enter the size of your slice: ");
        sizeSlice = kb.nextInt();*/
        
        String s1;
        s1 = JOptionPane.showInputDialog("Enter the diameter for your pie: ");
        diameter = Integer.parseInt(s1);
        s1 = JOptionPane.showInputDialog("Enter the size of your slice: ");
        sizeSlice = Integer.parseInt(s1);
        
        area = 3.14 * ((diameter/2)*(diameter/2));

        Calculate();//name of data type without variable. jumps to Calculate method, transfers values
        //have same order parameters^     
        
    }//end method main
    
    public static void Calculate() { //start method calculate
        numSlices = (int) area/sizeSlice;
        //output
        //System.out.println("The number of slices for a/n " + diameter + " inch pizza with " + sizeSlice + " inch slices is " + numSlices);
        JOptionPane.showMessageDialog(null, "The number of slices for a/n " + diameter + " inch pizza with " + sizeSlice + " inch slices is " + numSlices);
        
    } //end method calculate
    
    
}//end class
