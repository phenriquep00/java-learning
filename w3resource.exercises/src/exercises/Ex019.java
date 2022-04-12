package exercises;

import java.util.Scanner;

public class Ex019 {
    //19. Write a Java program to convert a decimal number to binary number.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int myInt = scan.nextInt();

        String myBinary = Integer.toBinaryString(myInt);

        System.out.println(myBinary);

        scan.close();
    }
}
