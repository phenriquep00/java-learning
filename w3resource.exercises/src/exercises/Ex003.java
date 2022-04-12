package exercises;

import java.util.Scanner;

public class Ex003 {
    // 3. Write a Java program to divide two numbers and print on the screen
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("first number: ");
        int a = scan.nextInt();
        System.out.println("second number: ");
        int b = scan.nextInt();
        int c = a / b;
        System.out.println("The division of this two numbers is " + c);
        scan.close();
    }
}
