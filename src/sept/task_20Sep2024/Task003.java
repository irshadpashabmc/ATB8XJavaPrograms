package sept.task_20Sep2024;

import java.util.Scanner;

public class Task003 {
    public static void main(String[] args) {
// Triangle Classifier ( If)
// Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides, determine
// if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or
// scalene (no sides are equal).
// Use an if-else statement to classify the triangle.
// side1, side2, side3 ->

        Scanner SC1 = new Scanner(System.in);
        System.out.println("Enter side 1 value of the triangle");
        double side1 = SC1.nextDouble();

        Scanner SC2 = new Scanner(System.in);
        System.out.println("Enter side 2 value of the triangle");
        double side2 = SC2.nextDouble();

        Scanner SC3 = new Scanner(System.in);
        System.out.println("Enter side 3 value of the triangle");
        double side3 = SC3.nextDouble();

        if (side1 >= 1 && side2 >= 1 && side3 >= 1) {
            if ((side1 == side2) && (side1 == side3) && (side2 == side3)) {

                System.out.println("This type of Triangle is: equilateral Triangle");

            } else if ((side1 == side2) || (side1 == side3) || (side2 == side3)) {

                System.out.println("This type of Triangle is: Isosceles Triangle");

            } else if (side1 != side2 && side1 != side3 && side2 != side3) {

                System.out.println("This type of Triangle is: scalene Triangle");
            }
        } else {
            System.out.println("something went wrong");
        }
    }

    }


