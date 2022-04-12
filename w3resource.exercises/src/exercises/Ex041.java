package exercises;

import java.util.Scanner;

public class Ex041 {
    //41. Write a Java program to print the ascii value of a given character.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        int ascii_ch = (int) ch;

        System.out.println("The ASCII value of Z is : "+ascii_ch);
        scan.close();
    }
}
