package sept.task_30Sep2024;

import java.util.Scanner;

public class Task001 {
    public static void main(String[] args) {

        //  Table of number n = 10, print table with For or while.
        // 10 X 1 = 1, 10 X 2 = 20
/*
            for(int n = 10, mul = 1;mul<=10; mul++) {
                System.out.printf("%d X %d = %d\n", n, mul, mul * n);
            } */

        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the Table number between 1 to 100 or any\n" +
                " for eg:- If you enter Number :10," +
                " Program will displays the result for Table 10:- 10 x 1 = 10 up to 10x10 = 100\n");

        int n = SC.nextInt();

        for(int mul = 1;mul<=10; mul++) {
            System.out.printf("%d X %d = %d\n", n, mul, mul * n);
            //  System.out.println(n+ "X"+ mul+ "="+ (n*mul));
        }
    }

}
