package nb.test.gamepackagev1;

import edu.sjcny.gpv1.*;
import java.awt.*;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class NBTestGamePackageV1 extends DrawableAdapter {  // start class 

    static NBTestGamePackageV1 ge = new NBTestGamePackageV1();
    static GameBoard gb = new GameBoard(ge, "Whackamole Game");

    static int count = 0, score = 0, num, x=1;
    static int array[] = new int[10];

    static Moles mole1 = new Moles(60, 130);
    static Moles mole2 = new Moles(225, 130);
    static Moles mole3 = new Moles(390, 130);
    static Moles mole4 = new Moles(60, 280);
    static Moles mole5 = new Moles(225, 280);
    static Moles mole6 = new Moles(390, 280);
    static Border border = new Border(0, 0);

    public static void main(String[] args) { // start main    
        showGameBoard(gb);

        /*for (count; y<20;y++){
            num = rand(num);
        }
        /*while (x < 20) {
            num = rand(num);
            //x++;
        }
        /* for(int x=1;x<=20;x++){
            num = rand(num);
        }
        //num = rand(num);*/
        //int num2 = rand(num);
        //num = (int) ((Math.random() * (6 - 1)) + 1);
        //System.out.println(num);
        for(int y = 0; y<10; y++){
            //num = rand(num);
            array[y] = rand(num); //create an array of random numbers 1-6 to use for which moles will appear. didnt use
        }
        System.out.println(Arrays.toString(array)); //wanted to use an array that has 10 random values that makes the moles appear at 10 diff instances
    }

    public static int rand(int num) {
        num = (int) ((Math.random() * (7 - 1)) + 1);
        System.out.println(num);
        return num;
    }

    public void draw(Graphics g) {// start draw
        if (count == 1 || count == 4 || count == 6 || count == 8 || count == 9 || count == 11 || count == 13 || count == 14 || count == 17 || count == 19) {
            
            showmoles(g);
        } // end big if statement
        else {

        }
        border.show(g);

        g.setColor(Color.red);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Your game time is: " + count, 10, 50);

    }// end draw

    public void timer1() {
        count++;
        num = rand(num); //new random number every second
        if (count == 20) {
            JOptionPane.showMessageDialog(null, "Your 20 seconds is up. Your total score is " + score);
    }
    }

    public void showmoles(Graphics g) {
        if (num == 1) { //if random number num is 1, show mole1 and setVisible to true 
            mole1.show(g);
            mole1.setVisible(true);
        } else {
            mole1.setVisible(false);
        }
        if (num == 2) {
            mole2.show(g);
            mole2.setVisible(true);
        } else {
            mole2.setVisible(false);
        }
        if (num == 3) {
            mole3.show(g);
            mole3.setVisible(true);
        } else {
            mole3.setVisible(false);
        }
        if (num == 4) {
            mole4.show(g);
            mole4.setVisible(true);
        } else {
            mole4.setVisible(false);
        }
        if (num == 5) {
            mole5.show(g);
            mole5.setVisible(true);
        } else {
            mole5.setVisible(false);
        }
        if (num == 6) {
            mole6.show(g);
            mole6.setVisible(true);
        } else {
            mole6.setVisible(false);
        }
    }//end showmoles method

    public void keyStruck(char key) { //if key is pressed and that mole is visible, give 10 points and set the moleVisble to false to make it disappear
        if ((key =='i' || key == '1') && mole1.getVisible()) {
            score = score + 10;
            mole1.setVisible(false);
            //moveUp(mole1);
        } else if ((key == 'o'|| key == '2') && mole2.getVisible()) {
            score = score + 10;
            mole2.setVisible(false);
            //moveUp(mole2);
        } else if ((key == 'p'|| key == '3') && mole3.getVisible()) {
            score = score + 10;
            mole3.setVisible(false);
            //moveUp(mole3);
        } else if ((key == 'k'|| key == '4') && mole4.getVisible()) {
            score = score + 10;
            mole4.setVisible(false);
            //moveDown(mole4);
        } else if ((key == 'l'|| key == '5') && mole5.getVisible()) {
            score = score + 10;
            mole5.setVisible(false);
            //moveDown(mole5);
        } else if ((key == ';'|| key == '6') && mole6.getVisible()) {
            score = score + 10;
            mole6.setVisible(false);
            //moveDown(mole6);
        }
    } //end keyStruck

    public void moveDown(Moles mole) {
        int currenty = mole.getY();
        currenty = currenty + 10;
        mole.setY(currenty);
    }

    public void moveUp(Moles mole) {
        int currenty = mole.getY();
        currenty = currenty - 10;
        mole.setY(currenty);
    }

}// end class

