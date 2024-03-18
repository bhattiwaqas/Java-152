
package calculator;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        double a;
        int b;
        double result;
        System.out.print("Enter a value for a: ");
        a = kb.nextDouble();
        System.out.print("Enter a value for b: ");
        b = kb.nextInt();
        
        //call Add method
        Add(a,b);
        //call Subtract method
        result = Subtract(a,b);
        System.out.println("The difference is " + result);
    }
    public static void Add(double a, int b){
        double sum;
        sum = a +b;
        System.out.println("The sum is " + sum);
    }
    
    public static double Subtract(double a, int b){
        double result = a-b;
        return result;
    }
    
}
