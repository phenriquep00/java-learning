package exercises;

import java.util.Scanner;

public class Ex021 {
    //20. Write a Java program to convert a decimal number to hexadecimal number.
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int myInt = scan.nextInt();
        String hex = Integer.toOctalString(myInt);

        System.out.println(hex);

        scan.close();
    }

}