package exercises;

import java.util.Scanner;

public class Ex060 {
    // 60. Write a Java program to find the penultimate (next to last) word of a sentence.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("input a phrase: ");
        String myStr = scan.nextLine();
        String[] array = myStr.split(" ");
        String penultimate = "";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 2) {
                penultimate = array[i];
            }
        }
        System.out.println(penultimate);
        scan.close();
    }
}
