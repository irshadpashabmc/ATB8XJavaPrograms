package sept.task_30Sep2024;

import java.math.BigInteger;
import java.util.Scanner;
public class Task002 {
    public static void main(String[] args) {

        //  Factorial Program - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120
        // n = 1 ->  Fact = 1*1 -> 1
        // n = 3 -> Fact = 3*2*1 -> 6

        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the Factorial value:\n");

        // int fac = 1;
        BigInteger fac = BigInteger.ONE;

        for(int n = SC.nextInt();n>=1;n--) {
            //  fac *=n;
            fac = fac.multiply(BigInteger.valueOf(n));
            //  System.out.println("N values are:" +n);
        }
        System.out.println("Factorial value is:" +fac);
    }

}

