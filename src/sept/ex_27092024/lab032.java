package sept.ex_27092024;

import java.util.Scanner;

public class lab032 {

    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the value:");
        int a = SC.nextInt();

        if (a>=0) {
            System.out.println("Positive response go to next ok");
            if (a >= 0) {

                System.out.println("voila 2nd negative response go to next ok");

                if (a == 0) {

                    System.out.println("Wow 3rd zero response great exit please");
                } else {

                    System.out.println("3rd response is failed");
                }
            } else {
                System.out.println("2nd response is failed");

            }
        }else {

            System.out.println("1st response is failed");

        }

        }
    }

