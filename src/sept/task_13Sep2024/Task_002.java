package sept.task_13Sep2024;

import java.util.Scanner;

public class Task_002 {

    public static void main(String[] args) {
/*
        Prepare a small calculator, which supports +, - ,*, / and %(?) - Modulus operator
        double a = 34;
        double b = 10;
        Print - a+b, a-b, ab, a/b, a%b all the outputs.
*/
        // Normal calculation
    /*    double a = 34;
        double b = 10;
        double c = a>b ? 34.0: 10.0;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a*b);
        System.out.println(c);*/

   // Using Printf and %f
        double a = 34;
        double b = 10;
        System.out.printf("addition of two numbers: %f+%f = %f\n",a,b,(a+b));
        System.out.printf("Subtraction of two numbers: %f+%f = %f\n",a,b,(a-b));
        System.out.printf("Multiplication of two numbers: %f+%f = %f\n",a,b,(a*b));
        System.out.printf("Division of two numbers: %f+%f = %f\n",a,b,(a/b));
        System.out.printf("Modulas of two numbers: %f+%f = %f\n",a,b,(a%b));

    }
}
