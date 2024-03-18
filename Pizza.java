/*
 Waqas Bhatti
 calculate slices of pizza based off diameter
 find area given diameter. find amount of slices given the avg slice size.
 */
package pizza;
//imports here  package, import, public class
import java.util.Scanner;

public class Pizza {

    public static void main(String[] args) { //method main
        Scanner kb = new Scanner(System.in);
        
        int diameter, sizeSlice;
        double area;
        
        //diameter = 18;
        System.out.print("Enter the diameter for your pie: ");
        diameter = kb.nextInt();
        
        //sizeSlice = 30;
        System.out.print("Enter the size of your slice: ");
        sizeSlice = kb.nextInt();
        
        area = 3.14 * ((diameter/2)*(diameter/2));

        Calculate(sizeSlice, diameter, area);//name of data type without variable. jumps to Calculate method, transfers values
        //have same order parameters^     
        
    }//end method main
    
    public static void Calculate(int sizeSlice, int diameter, double area) { //start method calculate
        int numSlices = (int) area/sizeSlice;
        System.out.println("The number of slices for a/n " + diameter + " inch pizza with " + sizeSlice + " inch slices is " + numSlices);
        
    } //end method calculate
    
    
}//end class
