package in.olc.basic;

public class greatestNumber {
    public static void main(String args[]){
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        if (num1 >= num2 && num1 >= num3){
            System.out.println("Num1 is greater");
        }else if(num2 >= num2 && num2 >= num3){
            System.out.println("num2 is greater");
        }else if(num3 >= num1 && num3 >= num2){
            System.out.println("num3 is greater");
        }

    }
}
