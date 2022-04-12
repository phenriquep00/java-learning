package exercises;

import java.util.Scanner;

public class Ex001 {
    // 1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = scan.nextLine();
        System.out.println("Hello");
        System.out.println(name);
        scan.close();
    }
}
