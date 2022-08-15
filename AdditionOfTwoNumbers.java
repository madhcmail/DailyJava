package in.olc.basic;

public class AdditionOfTwoNumbers {
    public static void main(String[] args){
        if (args.length != 2){
            System.out.println("Please pass two arguments!");
        }
        else {
            String s1 = args[0];
            String s2 = args[1];
            int total = Integer.parseInt(s1) + Integer.parseInt(s2);
            System.out.println("The sum of two numbers is: " + total);
        }
    }
}
