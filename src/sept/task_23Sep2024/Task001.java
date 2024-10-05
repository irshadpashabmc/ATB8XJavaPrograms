package sept.task_23Sep2024;

import java.util.Scanner;

public class Task001 {
    public static void main(String[] args) {
        // Create a simple calculator that performs addition, subtraction,
        // multiplication, and division, modus based on user input using switch statements.
        //Inputs :   num 1, num 2, +
        //Output :  num1+num2 → print information.

        String Str;
        int Num1;
        int Num2;


        Scanner SC = new Scanner(System.in);

        System.out.println("Enter the Operation to be performed for" +
                " eg: enter Addition, Subtraction," +
                "Multiplication, Division, Modulus- ");
        Str = SC.nextLine();

        System.out.println("Enter the Num 1");
          Num1 = SC.nextInt();

        System.out.println("Enter the Num 2");
          Num2 = SC.nextInt();

       switch (Str) {
           case "Addition":
               System.out.println("Addition of num 1 + num 2 is:" +(Num1+Num2));
               break;
           case "Subtraction":
               System.out.println("Subtraction of num 1 - num 2 is:" +(Num1-Num2));
               break;
           case "Multiplication":
               System.out.println("Multiplication of num 1 * num 2 is:" +(Num1*Num2));
               break;
           case "Division":
               System.out.println("Division of num 1 / num 2 is:" +(Num1/Num2));
               break;
           case "Modulus":
               System.out.println("Modulus of num 1 % num 2 is:" +(Num1%Num2));
               break;
           default:
               System.out.println("Nothing wrong entry");
      }

    }
}
