package exercises;

import java.util.Scanner;

public class Ex052 {
    //52. Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("1° number: ");
        int firstInt = scan.nextInt();
        System.out.print("2° number: ");
        int secondInt = scan.nextInt();
        System.out.print("3° number: ");
        int thirdInt = scan.nextInt();

        int sum = firstInt + secondInt;

        if (sum == thirdInt) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        scan.close();
    }
}
