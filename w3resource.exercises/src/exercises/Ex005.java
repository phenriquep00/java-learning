package exercises;

import java.util.Scanner;

public class Ex005 {
    //5. Write a Java program that takes two numbers as input and display the product of two numbers.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("first number: ");
        int a = scan.nextInt();
        System.out.println("second number: ");
        int b = scan.nextInt();
        int c = a * b;
        System.out.println("The product of this two numbers is " + c);
        scan.close();
    }
}
