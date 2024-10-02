package sept.ex_27092024;
import java.util.Scanner;

public class lab033 {
    public static void main(String[] args) {

                Scanner SC = new Scanner(System.in);
                System.out.println("Enter the student's score:");
                int score = SC.nextInt();

                if (score >= 60) {
                    if (score >= 90) {
                        System.out.println("Grade: A");
                    } else if (score >= 75) {
                        System.out.println("Grade: B");
                    } else {
                        System.out.println("Grade: C");
                    }
                } else {
                    System.out.println("Failing Grade");
                }
            }
        }



