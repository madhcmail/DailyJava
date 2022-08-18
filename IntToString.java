/* You are given an integer , you have to convert it into a string.

Please complete the partially completed code in the editor.
If your code successfully converts  into a string  the code will print "Good job".
Otherwise it will print "Wrong answer".

 can range between  to  inclusive. */


package in.olc.basic;

import java.util.Scanner;

public class IntToString {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Integer value
        s.close();
        //int n = 100;

        String st = String.valueOf(n); // converting to String
        System.out.println(st);
        if (n == Integer.parseInt(st)){
            System.out.println("Good Job");
        }else {
            System.out.println("Wrong Answer");
        }

    }
}
