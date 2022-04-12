package exercises;

import java.util.Scanner;

public class Ex072 {
    //72. Write a Java program to create a new string taking first three characters from a given string. If the length of the given string is less than 3 use "#" as substitute characters.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("input first string: ");
        String str1 = scan.nextLine();
        System.out.print("input second string: ");
        String str2 = scan.nextLine();

        if (str1.equals(" ") || str1.length() == 0) {
            System.out.print("#" + str2.charAt(str2.length() - 1));
        } else if (str2.equals(" ") || str2.length() == 0) {
            System.out.print(str1.substring(0, 1) + '#');
        } else {
            System.out.print(str1.substring(0, 1) + str2.charAt(str2.length() - 1));
        }
    }
}
