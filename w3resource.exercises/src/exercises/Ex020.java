package exercises;

import java.util.Scanner;

public class Ex020 {
    //20. Write a Java program to convert a decimal number to hexadecimal number.
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int myInt = scan.nextInt();
        String hex = Integer.toHexString(myInt);

        System.out.println(hex);

        scan.close();
    }

}
