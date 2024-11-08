package october.ex_24102024;

import java.util.Random;

public class Randompractice {

    public static void main(String[] args) {

            Random random = new Random();
            int fiveDigitNumber1 = 10000 + random.nextInt(90000); // Generates a number between 10000 and 99999
            System.out.println("Random 5-digit number: " + fiveDigitNumber1);

        int fiveDigitNumber2 = 10000 + (int)(Math.random() * 90000); // Generates a number between 10000 and 99999
        System.out.println("Random 5-digit number: " + fiveDigitNumber2);

        int ss = 10+random.nextInt();
        System.out.println(ss);

            }
        }

