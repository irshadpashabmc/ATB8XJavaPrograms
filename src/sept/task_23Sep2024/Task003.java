package sept.task_23Sep2024;

import java.util.Scanner;

public class Task003 {
    public static void main(String[] args) {
        //   Write a program that converts between different units (e.g.,
        //   kilometers to miles, Celsius to Fahrenheit) based on user
        //     selection using a switch statement.
        //   Input. -choice - 1 - km → m, km → 1km
        //   choice - 2 - f → c, f → c
        String Str;
        Scanner SC = new Scanner(System.in);
        System.out.println("Select the following unit conversion:-");
        System.out.println("Choice 1: Convert Kilometers to Miles or Miles to Kilometers");
        System.out.println("Choice 2: Convert Celsius to Fahrenheit or Fahrenheit to Celsius");

       int Choice = SC.nextInt();
        Str = SC.nextLine();
        switch (Choice) {

            case 1:
                System.out.println("Enter 'KMTM' to convert Kilometers to Miles or" +
                        " 'MTKM' to convert Miles to Kilometers:");

                Str = SC.nextLine();
                if (Str.equals("KMTM"))
                {
                    System.out.println("Enter the value in Kilometers:");
                    int kilometers  = SC.nextInt();
                  double Miles =  kilometers *(0.621371);
                    System.out.println(Miles);

                } else if (Str.equals("MTKM")) {
                    System.out.println("Enter the value in Miles:");
                    int Miles = SC.nextInt();
                    double kilometers =  Miles*(1.60934);
                    System.out.println(kilometers);
                }
                break;
            case 2:
                System.out.println("Enter 'CTF' to convert Celsius to Fahrenheit or 'FTC' to convert Fahrenheit to Celsius:");
                Str = SC.nextLine();

                if (Str.equals("CTF")) {
                    System.out.println("Enter the temperature in Celsius:");
                    int celsius = SC.nextInt();
                    double fahrenheit = (celsius * 9 / 5.0) + 32;
                    System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
                } else if (Str.equals("FTC")) {
                    System.out.println("Enter the temperature in Fahrenheit:");
                    int fahrenheit = SC.nextInt();
                    double celsius = (fahrenheit - 32) * 5 / 9.0;
                    System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius.");
                } else {
                    System.out.println("Invalid input for conversion.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
                break;
        }
        SC.close();
        }

    }

