/*
 Waqas Bhatti
LLAMAS with 2 methods
 */
package llamas_weight;
import javax.swing.*;

public class LLAMAS_WEIGHT {
    static int llamas, cost; //static int so I can print outside of Calculate method and maintain value of llamas and cost var.
    
    public static void main(String[] args) { //start main method
        int length;
        double area;
        
        String s1 = JOptionPane.showInputDialog("Input the dimensions of the plot of land: ");
        length = Integer.parseInt(s1);
        s1 = JOptionPane.showInputDialog("Enter the weight of the llamas: ");
        int weight = Integer.parseInt(s1);
        
        area = areaform(length); //return double method, returns area
        
        Calculate(area); // void method
        
        //JOptionPane.showMessageDialog(null, "Total llamas: " + llamas);
        //JOptionPane.showMessageDialog(null, "Total cost: $" + cost);
        
        int persurcharge = surcharge(weight);
        int totalsurcharge = persurcharge*llamas;
        System.out.println("The area is " + area);
        System.out.println("The total number of llamas is " + llamas);
        if (persurcharge !=0){
            System.out.println("Your surcharge is $" + persurcharge + " per llama. Therefore a total surcharge of $" +totalsurcharge+ " for " +llamas+ " llamas.");
        }
        System.out.println("Your total cost is $" + (cost+totalsurcharge));
    } //end main method
    
    public static void Calculate(double area) { //start Calculate method
        
        llamas = (int) area/42;
        cost = 250*llamas;
    } //end Calculate method
    
    public static double areaform(int length){ //start areaform method
        double area = 2*(1+Math.sqrt(2))*Math.pow(length,2);
        return area;
    
    } //end areaform method
    
    public static int surcharge(int weight){ //start surcharge method
        int charge;
        if (weight>500){
            charge = 100;
        }
        else if (weight>300){
            charge = 50;
        }
        else if (weight>200){
            charge=25;
        }
        else{
            charge=0;
        }
        return charge;
    } //end surcharge method
}
