/*
  waqas bhatti
bmi
 */
package bmi;

import java.util.Scanner;

public class BMI { //start class

    public static void main(String[] args) { //start main method
        Scanner kb = new Scanner(System.in);
        double height, weight, BMIval;

        System.out.println("Input your height: ");
        height = kb.nextDouble();
        System.out.println("Input your weight: ");
        weight = kb.nextDouble();

        BMIval = ((weight * 703) / Math.pow(height, 2));
        System.out.println("BMI value is: " + BMIval);
        
        //category(BMIval); //void method
        String category = category2(BMIval); //return cat var from string method. and declares String category var in main method
        System.out.println("You are " + category);
    } //end main method

    public static void category(double BMIval) { //start category void
        if ((BMIval <= 24.9) && (BMIval >= 18.5)) { //18.5-24.9 normal
            System.out.println("You are normal weight.");
        } else if (BMIval > 30) { //30+ obese
            System.out.println("You are obese.");
        } else if (BMIval > 24.9) { //24.9-30 overweight
            System.out.println("You are overweight.");
        } else { //under 18.5 underweight
            System.out.println("You are underweight.");
        }
    } //end category void

    public static String category2(double BMIval) { //start category2 string return
        String cat = " "; //sets cat into a blank var. required if no else statement bc theres no value
        if (BMIval <= 24.9 && BMIval >= 18.5) {
            System.out.println("You are okay.");
            System.out.println("You are normal weight.");
        } else {
            System.out.println("You are not okay.");
            if (BMIval > 30) { //30+ obese
                cat = "obese.";
            } else if (BMIval > 24.9) { //24.9-30 overweight
                cat = "overweight.";
            } else { //under 18.5 underweight
                cat = "underweight.";
            }
        } //end large else statement
        return cat;
    } //end category2 string method
} //end class
