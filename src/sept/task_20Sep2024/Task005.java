package sept.task_20Sep2024;

import java.util.Scanner;

public class Task005 {
    public static void main(String[] args) {
        // Leap Year Program - Find 2024

        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the Year\n");

        int Year = SC.nextInt();

        if ((Year % 4 == 0) && (Year % 100 != 0) || (Year % 400 == 0))
        {
            System.out.println("Is LeapYear");
        }
         else {
            System.out.println("Not a LeapYear");
        }
    }
}
