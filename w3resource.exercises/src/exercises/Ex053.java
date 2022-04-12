package exercises;

import java.util.Scanner;

public class Ex053 {
    /*
    53. Write a Java program that accepts three integers from the user and return true if the second number is greater than first number and third number is greater than second number. If "abc" is true second number does not need to be greater than first number.
    */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("1° number: ");
        int firstInt = scan.nextInt();
        System.out.print("2° number: ");
        int secondInt = scan.nextInt();
        System.out.print("3° number: ");
        int thirdInt = scan.nextInt();

        if (firstInt < secondInt && secondInt < thirdInt ){
            System.out.println("true");

        } else {
            System.out.println("false");
        }

        scan.close();
    }
}
