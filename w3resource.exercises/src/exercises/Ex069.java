package exercises;

import java.util.Scanner;

public class Ex069 {
    // 69. Write a Java program to extract the first half of a string of even length.
    // Sample input: Python
    // Sample output: Pyt
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("input a even string: ");
        String myStr = scan.nextLine();

        while (myStr.length() % 2 != 0) {
            System.out.print("Invalid input. Please type a even string: ");
        }

        int half = myStr.length() / 2;
        String newStr = "";

        for (int i = 0; i < myStr.length(); i++){
            if (i < half){
                newStr += myStr.charAt(i);
            }
        }

        System.out.print("Half of the String: " + newStr);
        scan.close();

    }
}
