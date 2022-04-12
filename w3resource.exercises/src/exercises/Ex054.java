package exercises;

import java.util.Scanner;

public class Ex054 {
    /*
    54. Write a Java program that accepts three integers from the user and return true if two or more of them (integers ) have the same rightmost digit. The integers are non-negative.
    */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("1° number: ");
        String firstInt = scan.nextLine();
        char ch1 = firstInt.charAt(firstInt.length() - 1);
        System.out.print("2° number: ");
        String secondInt = scan.nextLine();
        char ch2 = secondInt.charAt(secondInt.length() - 1);
        System.out.print("3° number: ");
        String thirdInt = scan.nextLine();
        char ch3 = thirdInt.charAt(thirdInt.length() - 1);

        if (ch1 == ch2 || ch1 == ch3 || ch2 == ch3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
        scan.close();
    }
}
