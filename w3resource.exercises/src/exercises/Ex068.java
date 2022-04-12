package exercises;

import java.util.Scanner;

public class Ex068 {
    // 68. Write a Java program to create a new string of 4 copies of the last 3 characters of the original string. The length of the original string must be 3 and above.
    // Sample Output:

    // 3.03.03.03.0
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("input the string: ");
        String myStr = scan.nextLine();
        while (myStr.length() < 3) {
            System.out.print("Invalid string, the length of the string must be 3 or more characters. Please try again: ");
            myStr = scan.nextLine();
        }
        String newStr = myStr + "." +myStr + "." +myStr + "." +myStr;
        System.out.print("New String: " + newStr);
        scan.close();
    }
}
