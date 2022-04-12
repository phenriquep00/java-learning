package exercises;

import java.util.Scanner;
public class Ex061 {
    // 61. Write a Java program to reverse a word.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("input a word: ");
        String myStr = scan.nextLine();
        char[] chars = myStr.toCharArray();
        
        for (int i = chars.length - 1; i >= 0; i--){
            System.out.print(chars[i]);
        }
            
        scan.close();
    }
}
