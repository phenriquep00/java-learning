package exercises;

import java.util.Scanner;

public class Ex070 {
    // 70. Write a Java program to create a string in the form short_string + long_string + short_string from two strings. The strings must not have the same length.
    /*
    Test Data: Str1 = Python
    Str2 = Tutorial
    Sample Output:

    PythonTutorialPython
    */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("input first string: ");
        String str1 = scan.nextLine();
        System.out.print("input second string: ");
        String str2 = scan.nextLine();

        String lastString = str1 + str2 + str1;

        System.out.print("new string: " + lastString);

        scan.close();
    }
}
