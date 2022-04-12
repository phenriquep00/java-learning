package exercises;

import java.util.Scanner;

public class Ex006 {
    //6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("a: ");
        System.out.println("b: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        scan.close();
    }
}
