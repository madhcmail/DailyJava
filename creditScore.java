package in.olc.basic;

/*
WAP to get a cibil score of a Guy and his CTC
If the score is greater than equal to 650
He can get 60% of his CTC as Loan.
If the score is between 500 and 650(not including 650)
	He can get 30% of his CTC as Loan
Otherwise No loan.

Input: 680 350000
 */
public class creditScore {
    public static void main(String args[]){

        int cscore= Integer.parseInt(args[0]);
        int ctc= Integer.parseInt(args[1]);

        Object result= calculateLoan(cscore,ctc);
        System.out.println(result);

    }
    public static float calculateLoan(int cscore, int ctc){

        return (cscore >= 650)? ctc * 0.6f:((cscore >= 500 && cscore < 650)?ctc * 0.3f:0.0f);

    }


}
