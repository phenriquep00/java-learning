package exercises;

import java.util.Scanner;

public class Ex007 {
    //7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
    public static void main(String[] args){
        System.out.println("number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int a = 0; a < 11; a++){
            System.out.print(num + " * " + a + " = ");
            System.out.println(num * a);
        }

        scan.close();
    }
}
