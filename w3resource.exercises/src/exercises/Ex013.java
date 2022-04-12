package exercises;

import java.util.Scanner;

public class Ex013 {
    //13. Write a Java program to print the area and perimeter of a rectangle.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("l1: ");
        double l1 = scan.nextDouble();
        System.out.println("l2: ");
        double l2 = scan.nextDouble();

        double area = l1 * l2;
        double perimeter = l1 * 2 + l2 * 2;

        System.out.println("Area: " + area + "cm²");
        System.out.println("Perimeter: " + perimeter + "cm");
        

        scan.close();

    }
}
