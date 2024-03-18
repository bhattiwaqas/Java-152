package loops;

public class Loops {

    public static void main(String[] args) {

        for (int x=10; x>0; x--){
            System.out.println(x);
        }
        int y=11;
        while (y>0){
            y--;
            System.out.println(y);
        }
        System.out.println("BLASTOFF");

        
        int grade;
        grade=0;
        while (grade!=-999){
            s1 = JOptionPane.showInputDialog(Enter a grade, enter -999 when finished);
            grade = Integer.parseInt(s1);
            System.out.println("you entered " + grade);
        }
    } //end main class
    
}
