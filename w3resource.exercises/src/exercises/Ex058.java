package exercises;

import java.util.Scanner;

public class Ex058 {
    // 58. Write a Java program to capitalize the first letter of each word in a sentence.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("input a phrase: ");
        String myStr = scan.nextLine();
        
        String[] parts = myStr.split(" ");

        myStr = "";
        for (int i = 0; i < parts.length; i++) {
            myStr += parts[i].substring(0, 1).toUpperCase() + parts[i].substring(1) + " ";
        }

        // myStr = String.join(" ", parts);

        System.out.println(myStr);

        scan.close();
    }
}
