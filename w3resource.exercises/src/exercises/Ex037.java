package exercises;

import java.util.Scanner;


public class Ex037 {
    //37. Write a Java program to reverse a string.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();
        System.out.println(stringReverser(myStr));

        scan.close();
    }

    public static String stringReverser(String str){
        char ch;
        String newString = "";
        for (int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            newString = ch + newString;
        }
        return newString;
    }
}
